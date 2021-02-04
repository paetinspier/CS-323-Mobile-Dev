package com.paetin.coffeeorderapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // MODEL
    public Coffee coffee;

    // reference all of the views

    //chocolate checkBox
    public CheckBox hasChocolate;

    // cream checkbox
    public CheckBox hasCream;

    // quantity textview
    public TextView quantity;

    // summary textview
    public TextView summary;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // instantiate the model
        coffee = new Coffee();

        // reference all of the views
        // the purpose of this is to connect the controller with the view

        // checkBoxes
        hasChocolate = (CheckBox) findViewById(R.id.checkBox);
        hasCream = (CheckBox) findViewById(R.id.checkBox2);

        //Textviews
        quantity = (TextView) findViewById(R.id.quantity);
        summary = (TextView) findViewById(R.id.textView4);

    }

    // controller methods

    // determines if the chocolate box has been checked or not
    public void setHasChocolate(View view){
        coffee.setHasChoco(hasChocolate.isChecked());
    }

    // determines if the cream box has been checked or not
    public void setHasCream(View view){
        coffee.setHasCream(hasCream.isChecked());
    }


    //add to coffee quantity
    public void add(View view){
        coffee.addQuantity();
        quantity.setText(coffee.getQuantity()); // we don't need to do .toString() here because we already did it in Coffee.java
    }

    // subtract from coffee quantity
    public void sub(View view){
        coffee.subQuantity();
        quantity.setText(coffee.getQuantity());
    }

    // do the summary
    public void sum(View view){
        summary.setText(coffee.getSummary());
    }
}