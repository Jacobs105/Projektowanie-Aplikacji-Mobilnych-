package com.example.jakub.kalkulatorv2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

   private Button simpleButton,
    advancedButton,
    quitButton,
    button0,
    button1,
    button2,
    button3,
    button4,
    button5,
    button6,
    button7,
    button8,
    button9,
    buttonADD,
    buttonSUB,
    buttonMUL,
    buttonDIV,
    buttonEQU,
    buttonC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        simpleButton = findViewById(R.id.simpleCalculator);
        advancedButton = findViewById(R.id.advancedCalculator);
        quitButton = findViewById(R.id.quitCalculator);




        simpleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               setContentView(R.layout.simple_calculator);
            }
        });

        advancedButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setContentView(R.layout.advanced_calculator);
            }
        });

        quitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onStop();
            }
        });
    }



}
