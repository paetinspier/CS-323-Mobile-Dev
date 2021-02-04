package com.paetin.cookiemonster;

public class change {
    private boolean num;

    public void hunger(){
        num = true;
    }
    public void happy(){
        num = false;
    }
    public boolean getValue(){
        return num;
    }
}
