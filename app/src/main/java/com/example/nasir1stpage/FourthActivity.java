package com.example.nasir1stpage;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class FourthActivity extends AppCompatActivity {
    TextView javaIntroTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_fourth);

        javaIntroTextView = findViewById(R.id.javaIntroId);
        javaIntroTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the new activity when the TextView is clicked
                Intent intent = new Intent(FourthActivity.this, CalculatorActivity.class);
                startActivity(intent);
            }
        });
    }
}
