package com.example.jakub.kalkulatorv2;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


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
     button1 ,
     button2 ,
     button3 ,
     button4 ,
     button5 ,
     button6 ,
     button7 ,
     button8 ,
     button9 ,
     buttonADD,
     buttonSUB ,
     buttonMUL ,
     buttonDIV ,
     buttonEQU ,
     buttonDOT ,
     buttonC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button simpleButton = findViewById(R.id.simpleCalculator);
        Button advancedButton = findViewById(R.id.advancedCalculator);
        Button quitButton = findViewById(R.id.quitCalculator);

         button0 = findViewById(R.id.button0);
         button1 = findViewById(R.id.button1);
         button2 = findViewById(R.id.button2);
         button3 = findViewById(R.id.button3);
         button4 = findViewById(R.id.button4);
         button5 = findViewById(R.id.button5);
         button6 = findViewById(R.id.button6);
         button7 = findViewById(R.id.button7);
         button8 = findViewById(R.id.button8);
         button9 = findViewById(R.id.button9);
         buttonADD = findViewById(R.id.buttonADD);
         buttonSUB = findViewById(R.id.buttonSUB);
         buttonMUL = findViewById(R.id.buttonMUL);
         buttonDIV = findViewById(R.id.buttonDIV);
         buttonEQU = findViewById(R.id.buttonEQU);
         buttonDOT = findViewById(R.id.buttonDOT);
         buttonC = findViewById(R.id.buttonC);

        final TextView displayText = findViewById(R.id.displayText);
        editText = findViewById(R.id.editText);





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

        button0.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText()+ "0");
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText()+"1");
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText()+"2");
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText()+"3");
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText()+"4");
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText()+"5");
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText()+"6");
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText()+"7");
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText()+"8");
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText()+"9");
            }
        });
        buttonADD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editText == null) {
                    editText.setText("");
                } else {
                    valueOne = Float.parseFloat(editText.getText()+"");
                    add = true;
                    displayText.setText(valueOne +"+");
                    editText.setText(null);

                }
            }
        });
        buttonSUB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editText == null) {
                    editText.setText("");
                } else {
                    valueOne = Float.parseFloat(editText.getText()+"");
                    sub = true;
                    displayText.setText(valueOne +"-");
                    editText.setText(null);

                }
            }
        });
        buttonMUL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editText == null) {
                    editText.setText("");
                } else {
                    valueOne = Float.parseFloat(editText.getText()+"");
                    mul = true;
                    displayText.setText(valueOne +"*");
                    editText.setText(null);

                }
            }
        });
        buttonDIV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editText == null) {
                    editText.setText("");
                } else {
                    valueOne = Float.parseFloat(editText.getText()+"");
                    div = true;
                    displayText.setText(valueOne +"/");
                    editText.setText(null);

                }
            }
        });




    }



}
