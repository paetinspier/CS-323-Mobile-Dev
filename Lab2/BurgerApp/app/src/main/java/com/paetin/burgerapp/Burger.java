package com.paetin.burgerapp;

public class Burger {
    static final int BEEF = 100;
    static final int LAMB = 170;
    static final int OSTRICH = 150;
    static final int ASIAGO = 90;
    static final int CREME = 120;
    static final int PROSCIUTTO = 115;


    // DATA MEMBERS
    private int pattyCal;
    private int cheeseCal;
    private int prosciuttoCal;
    private int sauceCal;


    //Constructor
    public Burger(){
        pattyCal = BEEF;
        cheeseCal = ASIAGO;
        prosciuttoCal = 0;
        sauceCal = 0;
    }

    // SETTERS
    public void setPattyCal(int pattyCal){
        this.pattyCal = pattyCal;
    }
    public void setCheeseCal(int cheeseCal){
        this.cheeseCal = cheeseCal;
    }
    public void setProsciuttoCal(int prosciuttoCal){
        this.prosciuttoCal = prosciuttoCal;
    }
    public void setSauceCal(int sauceCal){
        this.sauceCal = sauceCal;
    }
    // GETTERS
    public int getPattyCal(){
        return pattyCal;
    }
    public int getCheeseCal(){
        return cheeseCal;
    }
    public int getProsciuttoCal(){
        return prosciuttoCal;
    }
    public int getSauceCal(){
        return sauceCal;
    }

    // because the prosciutto is a checkbox we may need to clear it
    public void clearProsciuttoCal(){
        prosciuttoCal = 0;
    }

    // ADD UP ALL THE CALS
    public int getTotalCal(){
        return pattyCal + cheeseCal + prosciuttoCal + sauceCal;
    }
}
