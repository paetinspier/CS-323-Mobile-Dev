package com.paetin.coffeeorderapp;



public class Coffee {
    public Integer quantity;
    public Boolean hasCream;
    public Boolean hasChoco;


    // make max and min for quantity
    public final int Max = 30;
    public final int Min = 0;

    // CONSTRUCTOR
    public Coffee(){
        quantity = 0;
        hasCream = false;
        hasChoco = false;

    }

    // add one to the quantity
    public void addQuantity(){
        if(quantity< Max){
            quantity++;
        }
    }
    // subtract one from quantity
    public void subQuantity(){
        if (quantity>Min){
            quantity--;
        }
    }

    // get the quantity and turn it into a string
    public String getQuantity(){
        return quantity.toString();
    }

    // now we need to set stuff
    public void setHasCream(Boolean isChecked){
        this.hasCream = isChecked;
    }

    public void setHasChoco(Boolean isChecked){
        this.hasChoco = isChecked;
    }

    // getting the order summary

    public String getSummary(){
        // start of with the price of plain coffee
        double price = quantity * 4;

        // add price increments depending on options
        if (hasChoco){
            price += quantity * 1;
        }
        if (hasCream){
            price += quantity * .5;
        }

        //make the order as a string
        String order = "";
        order += "With Whip: " + (hasCream? "Yes":"No") + "\n";
        order += "With Chocolate: " + (hasChoco?"Yes":"No") + "\n";
        order += "Item quantity: " + quantity.toString() + "\n\n";
        order += "Total: $" + String.format("%.2f",price) + "\nThank You!";
        return order;
    }

}
