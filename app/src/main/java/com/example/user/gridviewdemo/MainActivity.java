package com.example.user.gridviewdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    GridView gridView;
    ArrayList<Cricketer> cricketers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = findViewById(R.id.gd);
        cricketers = new ArrayList<Cricketer>();

        CustomAdapter adapter = new CustomAdapter(MainActivity.this, cricketers);
        gridView.setAdapter(adapter);

        setData();
    }

    private void setData() {
        Cricketer a = new Cricketer(R.drawable.icon, "Sakib");
        Cricketer b = new Cricketer(R.drawable.icon, "Mashrafi");
        Cricketer c = new Cricketer(R.drawable.icon, "Nasir");
        Cricketer d = new Cricketer(R.drawable.icon, "Shova");

        cricketers.add(a);
        cricketers.add(b);
        cricketers.add(c);
        cricketers.add(d);
        cricketers.add(a);
        cricketers.add(b);
        cricketers.add(c);
        cricketers.add(d);
    }
}
