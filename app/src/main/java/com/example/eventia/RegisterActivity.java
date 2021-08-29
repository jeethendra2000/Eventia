package com.example.eventia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {

    EditText username, email, password, confirm_password;
    Button signUp_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        username = findViewById(R.id.username);
        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        confirm_password = findViewById(R.id.confirm_password);
        signUp_button = findViewById(R.id.signUp_button);

        signUp_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String registerUsername = username.getText().toString();
                String emailAddress = email.getText().toString();
                String registerPassword = password.getText().toString();
                String registerConfirmPassword = confirm_password.getText().toString();

                Toast.makeText(RegisterActivity.this, registerUsername + emailAddress + registerPassword+ registerConfirmPassword, Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void openLoginActivity(View v){
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }
}