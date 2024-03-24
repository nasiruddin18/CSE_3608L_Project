package com.example.nasir1stpage;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class CalculatorActivity extends AppCompatActivity {

    EditText number1, number2;
    TextView res;
    TextView add, sub, mul, div, min, max;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_calculator);

        number1 = findViewById(R.id.firstNumEditText);
        number2 = findViewById(R.id.secondNumEditText);
        res = findViewById(R.id.resultTextView);
        add = findViewById(R.id.add);
        sub = findViewById(R.id.sub);
        mul = findViewById(R.id.mul);
        div = findViewById(R.id.div);
        min = findViewById(R.id.min);
        max = findViewById(R.id.max);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate('+');
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate('-');
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate('*');
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate('/');
            }
        });

        min.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate('m');
            }
        });

        max.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate('x');
            }
        });
    }

    private void calculate(char operator) {
        double num1 = Double.parseDouble(number1.getText().toString().trim());
        double num2 = Double.parseDouble(number2.getText().toString().trim());
        double result;
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            case 'm':
                result = Math.min(num1, num2);
                break;
            case 'x':
                result = Math.max(num1, num2);
                break;
            default:
                result = 0;
        }
        res.setText(String.valueOf(result));
    }
}
