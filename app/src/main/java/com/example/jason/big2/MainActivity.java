/*
    Basic Android app with UI to calculate Big 2 points. 


 */
package com.example.jason.big2;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int []total = new int [4];
    TextView[] totalText = new TextView[4];
    EditText [] addText = new EditText [4];


    public void onClick(View v){
        for (int i = 0; i < 3; i++){
            total[i] = Integer.parseInt(totalText[i].getText().toString());
        }
        for (int i = 0; i < 4; i++) {
            total[i] = total[i] + Integer.parseInt(addText[i].getText().toString());
            totalText[i].setText(String.valueOf(total[i]));
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        for (int i = 0; i < 4; i++)
            total[i] = 0;

        totalText[0] = (TextView) findViewById(R.id.total1);
        totalText[1] = (TextView) findViewById(R.id.total2);
        totalText[2] = (TextView) findViewById(R.id.total3);
        totalText[3] = (TextView) findViewById(R.id.total4);

        addText[0] =  (EditText) findViewById(R.id.add1);
        addText[1] =  (EditText) findViewById(R.id.add2);
        addText[2] =  (EditText) findViewById(R.id.add3);
        addText[3] =  (EditText) findViewById(R.id.add4);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
