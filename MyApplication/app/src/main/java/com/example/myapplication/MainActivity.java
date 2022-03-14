package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent ticket = new Intent(MainActivity.this,MainActivity2.class);
        EditText Name =findViewById(R.id.YourName);
        EditText Age =findViewById(R.id.YourAge);
        TextView emp = findViewById(R.id.ER);

        Button fly = findViewById(R.id.transferring);

        fly.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Name.getText().toString().isEmpty() || Age.getText().toString().isEmpty()){
                    emp.setText("Please check your name or age");
                }
                else {

                    String N = Name.getText().toString();
                    String A = Age.getText().toString();
                    ticket.putExtra("simple", N);
                    ticket.putExtra("simple1", A);

                    startActivity(ticket);
                }
            }
        });





        }
}
