package com.example.myapplication;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.ui.AppBarConfiguration;
import com.example.myapplication.databinding.ActivityMainBinding;

import kotlin.Suppress;

public class MainActivity extends AppCompatActivity {
        EditText editTextTextEmailAddress, password1, password2;

        TextView appStatusText;
        @SuppressLint("MissingInflatedId")
        @Override
        protected void onCreate(Bundle savedInstanceStatue) {
                super.onCreate(savedInstanceStatue);
                setContentView(R.layout.activity_main);
        }

}
