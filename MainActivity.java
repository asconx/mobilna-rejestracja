package com.example.mobilna_rejestracja;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText emailField, password1Field, password2Field;

    TextView appStatusText;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        emailField = findViewById(R.id.editTextEmail);
        password1Field = findViewById(R.id.editTextPassword);
        password2Field = findViewById(R.id.editTextPassword2);
        appStatusText = findViewById(R.id.textViewAppStatus);


    }





    public void onClick(View view){
        boolean containsAt = emailField.getText().toString().contains("@");
        boolean passwordOk = password1Field.getText().toString().equals(password2Field.getText().toString());

        if (!containsAt){
            appStatusText.setText("Nieprawidłowy adres e-mail");
        }else if (!passwordOk){
            appStatusText.setText("Hasła się różnią");
        }else{
            appStatusText.setText("Witaj "+ emailField.getText().toString());
        }
    }





}