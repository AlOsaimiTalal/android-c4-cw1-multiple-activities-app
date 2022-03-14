package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView mName =findViewById(R.id.MyName);
        TextView mAge =findViewById(R.id.MyAge);

        Bundle des = getIntent().getExtras();

        String NameF = des.getString("simple");
        String AgeF = des.getString("simple1");

        mName.setText(NameF);
        mAge.setText(AgeF);
    }
}