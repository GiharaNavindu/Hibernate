package com.ironone;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Alien {
    @Id
    private int eid;
    private String ename;
    private String stack;

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getStack() {
        return stack;
    }

    public void setStack(String stack) {
        this.stack = stack;
    }

    public Alien() {

    }
}
