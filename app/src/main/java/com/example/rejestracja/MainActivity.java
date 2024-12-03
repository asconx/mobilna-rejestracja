package com.example.rejestracja;

import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText emailField, password1Field, password2Field;
    TextView appStatusText, appStatusTexts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        emailField = findViewById(R.id.editTextText);
        password1Field = findViewById(R.id.editTextTextPassword);
        password2Field = findViewById(R.id.editTextTextPassword2);
        appStatusText = findViewById(R.id.button);
        appStatusTexts = findViewById(R.id.texts);

    }

    @SuppressLint("SetTextI18n")
    public void onClick(View view) {
        boolean containsAt = emailField.getText().toString().contains("@");
        boolean passwordOk = password1Field.getText().toString().equals(password2Field.getText().toString());

        if (!containsAt) {
            appStatusTexts.setText("Nieprawidłowy adres e-mail");
        } else if (!passwordOk) {
            appStatusTexts.setText("Hasła się różnią");
        } else {
            appStatusTexts.setText("Witaj !");
        }
    }

    public void onClick1(View view) {
        Toast.makeText(MainActivity.this, "Witaj to wiadomosc Toast", Toast.LENGTH_SHORT).show();

    }
}
