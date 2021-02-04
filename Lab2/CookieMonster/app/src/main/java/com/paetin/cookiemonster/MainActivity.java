package com.paetin.cookiemonster;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ImageView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    // MODEL
    private change change;

    // VIEW
    private ImageView happySadImg;
    private TextView happySadtxt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Toast.makeText(this, "app has been created", Toast.LENGTH_SHORT).show();
        setContentView(R.layout.activity_main);

        change = new change();
        happySadImg = (ImageView) findViewById(R.id.imageView);
        happySadtxt = (TextView) findViewById(R.id.textView);
        Button btn = (Button) findViewById(R.id.button);
        btn.setOnClickListener(toggleScreen);
    }
    private final View.OnClickListener toggleScreen = new View.OnClickListener(){
        public void onClick(View btn){
            boolean yn = change.getValue();
            if (yn == true){
                change.happy();
                happySadImg.setImageResource(R.mipmap.full);
                happySadtxt.setText("I am full");
            }
            else{
                change.hunger();
                happySadImg.setImageResource(R.mipmap.hungry);
                happySadtxt.setText("I am so hungry");
            }
        }
    };
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
    @Override
    protected void onStop(){
        super.onStop();
        Toast.makeText(this, "App has been stopped",Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onPause(){
        super.onPause();
        Toast.makeText(this, "app was paused",Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onResume(){
        super.onResume();
        Toast.makeText(this, "app was resumed",Toast.LENGTH_LONG).show();
    }
}