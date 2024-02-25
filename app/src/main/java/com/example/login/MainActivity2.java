package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    //Calls the attributes and classifies it's type.
    private Button button;
    private EditText edittext1, edittext2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        //Shows where to find the attributes in the xml file.
        button = findViewById(R.id.button);
        edittext1 = findViewById(R.id.edittext1);
        edittext2 = findViewById(R.id.edittext2);

        //Checks to see: if fields are empty, enables login if fields are filled.
        button.setOnClickListener(v -> {
            if (TextUtils.isEmpty(edittext1.getText().toString())) {
                Toast.makeText(MainActivity2.this, "No Empty Fields Allowed!", Toast.LENGTH_LONG).show();
            } else if (TextUtils.isEmpty(edittext2.getText().toString())) {
                Toast.makeText(MainActivity2.this, "No Empty Fields Allowed!", Toast.LENGTH_LONG).show();
            } else {
                Toast.makeText(MainActivity2.this, "Login Successful!", Toast.LENGTH_LONG).show();
            }
        });
    }
}