package com.example.jakub.kalkulatorv2;

import android.annotation.SuppressLint;
import android.icu.text.DecimalFormat;
import android.icu.text.NumberFormat;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Jakub on 2018-03-14.
 */



public class SimpleActivity extends AppCompatActivity {

    private TextView editText, displayText;
    private double valueOne = Double.NaN;
    private double valueTwo;
    private boolean add, sub, mul, div, equ, c;
    private String myEditText;
    private String myDisplayText;
    private final char ADDITION = '+';
    private static final char SUBTRACTION = '-';
    private static final char MULTIPLICATION = '*';
    private static final char DIVISION = '/';

    private char CURRENT_ACTION;

    private NumberFormat decimalFormat ;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.simple_calculator);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            decimalFormat = new DecimalFormat("#.#####");
        }

        getSavedData(savedInstanceState);

        Button button0 = findViewById(R.id.button0);
        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);
        Button button4 = findViewById(R.id.button4);
        Button button5 = findViewById(R.id.button5);
        Button button6 = findViewById(R.id.button6);
        Button button7 = findViewById(R.id.button7);
        Button button8 = findViewById(R.id.button8);
        Button button9 = findViewById(R.id.button9);
        Button buttonADD = findViewById(R.id.buttonADD);
        Button buttonSUB = findViewById(R.id.buttonSUB);
        Button buttonMUL = findViewById(R.id.buttonMUL);
        Button buttonDIV = findViewById(R.id.buttonDIV);
        Button buttonEQU = findViewById(R.id.buttonEQU);
        Button buttonDOT = findViewById(R.id.buttonDOT);
        Button buttonC = findViewById(R.id.buttonC);
        Button buttonNG = findViewById(R.id.buttonNG);

        displayText = findViewById(R.id.displayText);
        editText = findViewById(R.id.editText);

        displayText.setText(myDisplayText);
        editText.setText(myEditText);

        button0.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                editText.setText(editText.getText() + "0");
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                editText.setText(editText.getText() + "1");
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                editText.setText(editText.getText() + "2");
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                editText.setText(editText.getText() + "3");
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                editText.setText(editText.getText() + "4");
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                editText.setText(editText.getText() + "5");
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                editText.setText(editText.getText() + "6");
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                editText.setText(editText.getText() + "7");
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                editText.setText(editText.getText() + "8");
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                editText.setText(editText.getText() + "9");
            }
        });
        buttonDOT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!editText.getText().toString().contains("."))
                    editText.setText(editText.getText() + ".");
            }
        });
        buttonNG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double valueToNG = Double.parseDouble(String.valueOf(editText.getText()));
                if (valueToNG != Double.NaN) {
                    valueToNG = -(valueToNG);
                    editText.setText("" + valueToNG);
                }
            }
        });
        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText.getText().length() > 0) {
                    CharSequence currentText = editText.getText();
                    editText.setText(currentText.subSequence(0, currentText.length() - 1));
                } else {
                    editText.setText(null);
                    displayText.setText(null);
                    valueOne = Float.NaN;
                    valueTwo = Float.NaN;
                }
            }
        });


        buttonADD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                computeCalculation();
                CURRENT_ACTION = ADDITION;
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                    displayText.setText(decimalFormat.format(valueOne) + "+");
                }
                editText.setText(null);
            }
        });

        buttonSUB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                computeCalculation();
                CURRENT_ACTION = SUBTRACTION;
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                    displayText.setText(decimalFormat.format(valueOne) + "-");
                }
                editText.setText(null);
            }
        });

        buttonMUL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                computeCalculation();
                CURRENT_ACTION = MULTIPLICATION;
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                    displayText.setText(decimalFormat.format(valueOne) + "*");
                }
                editText.setText(null);
            }
        });

        buttonDIV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                computeCalculation();
                CURRENT_ACTION = DIVISION;
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                    displayText.setText(decimalFormat.format(valueOne) + "/");
                }
                editText.setText(null);
            }
        });

        buttonEQU.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.N)
            @Override
            public void onClick(View view) {
                computeCalculation();
                displayText.setText(displayText.getText().toString() +
                        decimalFormat.format(valueTwo) + " = " + decimalFormat.format(valueOne));
                valueOne = Double.NaN;
                CURRENT_ACTION = '0';
            }
        });
    }
        private void computeCalculation() {
            if(!Double.isNaN(valueOne)) {
                try {
                    valueTwo = Double.parseDouble(editText.getText().toString());
                    editText.setText(null);
                }catch(Exception e){e.printStackTrace();}



                if(CURRENT_ACTION == ADDITION)
                    valueOne = this.valueOne + valueTwo;
                else if(CURRENT_ACTION == SUBTRACTION)
                    valueOne = this.valueOne - valueTwo;
                else if(CURRENT_ACTION == MULTIPLICATION)
                    valueOne = this.valueOne * valueTwo;
                else if(CURRENT_ACTION == DIVISION)
                    valueOne = this.valueOne / valueTwo;
            }
            else {
                try {
                    valueOne = Double.parseDouble(editText.getText().toString());
                }
                catch (Exception e){}
            }
        }



    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {


        savedInstanceState.putString("displayText", String.valueOf(displayText.getText()));
        savedInstanceState.putString("editText", String.valueOf(editText.getText()));

        super.onSaveInstanceState(savedInstanceState);
    }


    public  void getSavedData(Bundle savedInstanceState){

        if(savedInstanceState != null) {
            myEditText = savedInstanceState.getString("editText");
            myDisplayText = savedInstanceState.getString("displayText");
        }
    }
}
