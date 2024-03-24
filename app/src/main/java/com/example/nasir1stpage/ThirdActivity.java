package com.example.nasir1stpage;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class ThirdActivity extends AppCompatActivity {
    Button signupBtn;
    EditText nameEditText, passEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_third);

        nameEditText = findViewById(R.id.nameEditText);
        passEditText = findViewById(R.id.passEditText);

        signupBtn = findViewById(R.id.signupButton);
        signupBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Retrieve entered name and password
                String name = nameEditText.getText().toString().trim();
                String password = passEditText.getText().toString().trim();

                // Check if the name matches the expected value
                if (name.equals("1229")) {
                    // Check if the password matches the expected value
                    if (password.equals("1234")) {
                        // If both name and password are correct, navigate to FourthActivity
                        Intent intent = new Intent(ThirdActivity.this, FourthActivity.class);
                        startActivity(intent);
                    } else {
                        // If only the password is incorrect, show a password error message
                        Toast.makeText(ThirdActivity.this, "Incorrect password", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    // If only the name is incorrect, show a name error message
                    Toast.makeText(ThirdActivity.this, "Incorrect User ID", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
