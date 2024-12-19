package com.example.rejestracja;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    EditText emailField, passwordField, password2Field;

    TextView appStatusText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        emailField = findViewById(R.id.editTextemail);
        password1Field = findViewById(R.id.editTextTextPassword);
        password2Field = findViewById(R.id.editTextTextPassword2);
        appStatusText =findViewById(R.id.textViewAppStatus);

    }
    //@SuppressLint(""SetTextI18n)
    public  void  onClick(View view) {
        boolean containsAt = emailField.getText().toString().contains("@");
        boolean passwordOk = password1Field.getText().toString().equals(password2Field.getText().toString());
        if (!containsAt) {
            appStatusText.setText("Nieprawidłowy adres e-mail");
        } else if (!passwordOk) {
            appStatusText.setText("Hasła się różnią");
        } else {
            appStatusText.setText("Witaj" + emailField.getText().toString());
        }
    }

}