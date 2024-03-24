package com.example.nasir1stpage;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        Button signupBtn = findViewById(R.id.button1) ;
        Button signinBtn = findViewById(R.id.signinBtn) ;

        signupBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(MainActivity.this,secondActivity.class);
                startActivity(intent);
                Toast.makeText(getApplicationContext(), "you clicked sign up ",Toast.LENGTH_LONG).show();
            }

        });
        signinBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity.this,ThirdActivity.class);
                startActivity(intent);
                Toast.makeText(getApplicationContext(), "you clicked sign in ",Toast.LENGTH_LONG).show();
            }
        });






        }
    }




