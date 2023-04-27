package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText email;
    private EditText password;
    private Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        email = findViewById(R.id.activity_main_email);
        password = findViewById(R.id.activity_main_password);
        loginButton = findViewById(R.id.activity_main_loginButton);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Failed login with no email and password
                if (email.getText().length() <= 0 && password.getText().length() <= 0) {
                    String toastMessage = "Email and Password are not populated";
                    Toast.makeText(getApplicationContext(), toastMessage, Toast.LENGTH_SHORT).show();
                }
                // Failed login with no email
                else if (email.getText().length() <= 0 && password.getText().length() > 0) {
                    String toastMessage = "Email is not populated";
                    Toast.makeText(getApplicationContext(), toastMessage, Toast.LENGTH_SHORT).show();
                }
                // Failed login with no password
                else if (email.getText().length() > 0 && password.getText().length() <= 0) {
                    String toastMessage = "Password is not populated";
                    Toast.makeText(getApplicationContext(), toastMessage, Toast.LENGTH_SHORT).show();
                } else {
                    // Successful login with correct email and password
                    if (email.getText().toString().equals("dasari.jayalakshmi17@gmail.com")
                            && password.getText().toString().equals("password")) {
                        String toastMessage = "Login Successful";
                        Toast.makeText(getApplicationContext(), toastMessage, Toast.LENGTH_SHORT).show();
                    } else {
                        // Failed for other combinations
                        String toastMessage = "Login Failed";
                        Toast.makeText(getApplicationContext(), toastMessage, Toast.LENGTH_SHORT).show();
                    }

                }
            }
        });
    }
}
