package com.paetin.tapbuttoncounter;

import androidx.appcompat.app.AppCompatActivity;

import android.nfc.Tag;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    //MODEL
    private Counter count;

    //VIEW
    private TextView countView;

    //TAG
    private static final String tag = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);

        count = new Counter();
        countView = (TextView) findViewById(R.id.textView);

    }

    public void countTap(View view){
        count.addCount();
        countView.setText(count.getCount().toString());
        Log.i(tag, "Paetin's Count: " + count.getCount().toString());
    }

    @Override
    public boolean onCreateOptionsMenu (Menu menu){
        //Inflate the menu;
        //this adds items to the action bar if it is presetn.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        //Handel action bar itme clicks here. the action bar will
        //automatically handle clicks on the Home/Up button, so long
        //as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}