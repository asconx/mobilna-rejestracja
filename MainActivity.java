package com.example.rejestracja;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

EditText emailField, passwordField, password2Field;

TextView appStatusText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_main);

         emailField = findViewById(R.id.editTextemail);
         passwordField = findViewById(R.id.editTextTextPassword);
         password2Field = findViewById(R.id.editTextTextPassword2);
         appStatusText = findViewById(R.id.textViewAppStatus);


    }

    @SuppressLint("SetTextI18n")
    public void onClick(View view) {
        boolean containsAt = emailField.getText().toString().contains("@");
        boolean password0k = passwordField.getText().toString().equals(password2Field.getText().toString());

        if (!containsAt) {
            appStatusText.setText("Nieprawidłowy adres e-mail");
        } else if (!password0k) {
            appStatusText.setText("Hasła się różnią");
        } else {
            appStatusText.setText("Witaj " + emailField.getText().toString());
        }
    }
}

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }




}