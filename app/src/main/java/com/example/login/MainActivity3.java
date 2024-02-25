package com.example.login;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity3 extends AppCompatActivity {
    //Calls the attributes and classifies it's type.
    private EditText Email, Password, Date, firstName, lastName;
    private Button reg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        //Shows where to find the attributes in the xml file.
        Email = findViewById(R.id.Email);
        Password = findViewById(R.id.Password);
        Date = findViewById(R.id.Date);
        firstName = findViewById(R.id.firstName);
        lastName = findViewById(R.id.lastName);
        reg = findViewById(R.id.reg);


        reg.setOnClickListener(v -> {
            String email = Email.getText().toString();
            String password = Password.getText().toString();
            String date = Date.getText().toString();
            String firstNameText = firstName.getText().toString();
            String lastNameText = lastName.getText().toString();
            //Creating Template for Email format.
            String emailPattern = "[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\\.+[a-z]+";

            //Checks: if fields are empty, if firstName is >3 & <30, if email matches format above
            if (TextUtils.isEmpty(email) || TextUtils.isEmpty(password) || TextUtils.isEmpty(date) || TextUtils.isEmpty(firstNameText) || TextUtils.isEmpty(lastNameText)) {
                Toast.makeText(MainActivity3.this, "No Empty Fields Allowed!", Toast.LENGTH_LONG).show();
            }else if (!email.matches(emailPattern)) {
                Toast.makeText(MainActivity3.this, "Invalid Email Address!", Toast.LENGTH_LONG).show();
            } else if (firstNameText.length() < 3 || firstNameText.length() > 30) {
                Toast.makeText(MainActivity3.this, "First Name must be greater than 3 and less than 30!", Toast.LENGTH_LONG).show();
            } else {
                Toast.makeText(MainActivity3.this, "Registration Complete!", Toast.LENGTH_LONG).show();
                openMainActivity();
            }
        });

    }
    //Connects MainActivities to each other
    private void openMainActivity() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}