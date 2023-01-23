package com.example.maya09;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    View view1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        view1= (View) findViewById(R.id.layout1);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.main,menu);
        menu.add(0,0,350,"Green");
        menu.add(0,0,400,"Previous page");
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item)
    {
        String st = item.getTitle().toString();
        if(st.equals("Blue"))
        {
            view1.setBackgroundColor(Color.CYAN);
        }
        if(st.equals("Pink"))
        {
            view1.setBackgroundColor(Color.MAGENTA);
        }
        if(st.equals("Gray"))
        {
            view1.setBackgroundColor(Color.LTGRAY);
        }
        if(st.equals("Green"))
        {
            view1.setBackgroundColor(Color.GREEN);
        }
        if(st.equals("Previous page"))
        {
            finish();
        }
        return true;
    }
}