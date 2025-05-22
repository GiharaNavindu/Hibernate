package com.ironone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Alien a1 = new Alien();
        a1.setEid(1);
        a1.setEname("Alien1");
        a1.setStack("Java");

        //using the hibernate
        Configuration config =  new Configuration();
        config.addAnnotatedClass(com.ironone.Alien.class);
        config.configure("hibernate.cfg.xml");
//        config.configure();
        SessionFactory factory = config.buildSessionFactory();
        Session session = factory.openSession();//this will open a session
        Transaction transaction = session.beginTransaction();
        session.persist(a1);
        transaction.commit();


    }
}