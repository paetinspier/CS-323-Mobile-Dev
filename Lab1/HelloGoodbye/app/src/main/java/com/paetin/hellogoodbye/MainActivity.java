package com.paetin.hellogoodbye;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    //DECLARE TEXT REFERENCE TO THE INTERFACE LAYOUT COMPONENT
    private TextView greetingTextView;

    //INDICATES HELLO IS CURRENTLY DISPLAYED
    private boolean isHello;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //TASK 1: INFLATE THE MAIN SCREEN LAYOUT USED BY THE APP
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //TASK 2: ESTABLISH REFERENCES TO THE TEXTVIEW AND BUTTON
        greetingTextView = (TextView) findViewById(R.id.textView);

        //TASK 3: INTERNALIZE GREETINGS
        initializeGreeting();

        //TASK 4: REGISTER THE LISTENER EVENT FOR THE BUTTON
        Button exclaimBtn = (Button) findViewById(R.id.button);
        exclaimBtn.setOnClickListener(toggleGreeting);
    }

    private final View.OnClickListener toggleGreeting = new View.OnClickListener(){
        public void onClick(View btn){
            //TASK 1: CONSTRUCT THE TOGGLE GREETING
            if (isHello){
                isHello = false;
                greetingTextView.setText("goodbye");
            }
            else{
                isHello = true;
                greetingTextView.setText("hello");
            }

        }
    };

    private void initializeGreeting(){
        isHello = true;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        // inflate the menu
        // this adds items to the action bar if it is present
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        //Handle action bar item clicks here. The action bar will automatically handle on home/Up button,
        //so long as you specify a parent activity in AndroidManifest.xml
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}