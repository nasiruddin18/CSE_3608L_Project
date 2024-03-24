package com.example.nasir1stpage;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class secondActivity extends AppCompatActivity {
    Button signupBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_second);

        signupBtn = findViewById(R.id.signupButton);
        signupBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // This code will execute when the button is clicked
                Intent nasir = new Intent(secondActivity.this, ThirdActivity.class);
                startActivity(nasir);
            }
        });
    }
}
