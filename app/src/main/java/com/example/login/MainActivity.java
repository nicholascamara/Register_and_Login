package com.example.login;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*
        Shows where to find the attributes in the xml file.
        Calls the attributes and classifies it's type.
         */
        Button button1 = findViewById(R.id.login);
        button1.setOnClickListener(v -> openMainActivity2());

        Button button2 = findViewById(R.id.register);
        button2.setOnClickListener(v -> openMainActivity3());
    }
    //Connects the appropriate button to the Main Activity required.
    public void openMainActivity2() {
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }
    //Connects the appropriate button to the Main Activity required.
    public void openMainActivity3() {
        Intent intent = new Intent(this, MainActivity3.class);
        startActivity(intent);
    }
}