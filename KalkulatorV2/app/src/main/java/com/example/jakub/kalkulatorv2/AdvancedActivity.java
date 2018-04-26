package com.example.jakub.kalkulatorv2;

import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;


/**
 * Created by Jakub on 2018-03-15.
 */

public class AdvancedActivity extends AppCompatActivity{

    private TextView editText, displayText;
    private double valueOne = Double.NaN;
    private double valueTwo = Double.NaN;
    private boolean add, sub, mul, div,xtoy ,equ, c;
    private DecimalFormat decimalFormat = new DecimalFormat("#.#####");
    private String myEditText;
    private String myDisplayText;
    private char CURRENT_ACTION;
    private final char ADDITION = '+';
    private final char SUBTRACTION = '-';
    private final char MULTIPLICATION = '*';
    private final char DIVISION = '/';
    private final char SINUS = 's';
    private final char COSIN = 'c';
    private final char TAN = 't';
    private final char LN = 'l';
    private final char SQRT = 'r';
    private final char POW = 'p';
    private final char POWT = 'P';
    private final char LOG = 'L';
    private final char PR = '%';

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.advanced_calculator);


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
        Button buttonSIN = findViewById(R.id.buttonSIN);
        Button buttonCOS = findViewById(R.id.buttonCOS);
        Button buttonTAN = findViewById(R.id.buttonTAN);
        Button buttonLN = findViewById(R.id.buttonLN);
        Button buttonSQRT = findViewById(R.id.buttonSQRT);
        Button buttonXTo2 = findViewById(R.id.buttonXTo2);
        Button buttonXToY = findViewById(R.id.buttonXtoY);
        Button buttonLOG = findViewById(R.id.buttonLOG);
        Button buttonpr = findViewById(R.id.buttonPR);
        Button buttonNG = findViewById(R.id.buttonNG);


        displayText = findViewById(R.id.displayText);
        editText = findViewById(R.id.editText);


        displayText.setText(myDisplayText);
        editText.setText(myEditText);
        readText(displayText);





        buttonNG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double valueToNG = Double.NaN;
                try {
                    valueToNG = Double.parseDouble(String.valueOf(editText.getText()));
                }catch (Exception e){

                }
                if (Double.isNaN(valueToNG)) {
                    Toast.makeText(AdvancedActivity.this, "No Value", Toast.LENGTH_SHORT).show();
                }else{
                    valueToNG = -(valueToNG);
                    editText.setText("" + valueToNG);
                }

            }
        });

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
        buttonADD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                computeCalculation();
                if (Double.isNaN(valueOne)) {
                    Toast.makeText(AdvancedActivity.this, "No Value", Toast.LENGTH_SHORT).show();
                } else {
                    CURRENT_ACTION = ADDITION;

                    displayText.setText(decimalFormat.format(valueOne) + "+");
                    editText.setText(null);
                }
            }
        });

        buttonSUB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                computeCalculation();
                if (Double.isNaN(valueOne)) {
                    Toast.makeText(AdvancedActivity.this, "No Value", Toast.LENGTH_SHORT).show();
                } else {
                CURRENT_ACTION = SUBTRACTION;
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                    displayText.setText(decimalFormat.format(valueOne) + "-");
                }
                editText.setText(null);
            }}
        });

        buttonMUL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                computeCalculation();
                if (Double.isNaN(valueOne)) {
                    Toast.makeText(AdvancedActivity.this, "No Value", Toast.LENGTH_SHORT).show();
                } else {
                CURRENT_ACTION = MULTIPLICATION;
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                    displayText.setText(decimalFormat.format(valueOne) + "*");
                }
                editText.setText(null);
                }
            }
        });

        buttonDIV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                computeCalculation();
                if (Double.isNaN(valueOne)) {
                    Toast.makeText(AdvancedActivity.this, "No Value", Toast.LENGTH_SHORT).show();
                } else {
                    CURRENT_ACTION = DIVISION;
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                        displayText.setText(decimalFormat.format(valueOne) + "/");
                    }
                    editText.setText(null);
                }
            }
        });

        buttonEQU.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.N)
            @Override
            public void onClick(View view) {
                computeCalculation();
                if(Double.isNaN(valueTwo)) {
                    displayText.setText(displayText.getText().toString() +
                            " = " + decimalFormat.format(valueOne));
                }else{

                    displayText.setText(displayText.getText().toString() +
                            decimalFormat.format(valueTwo) + " = " + decimalFormat.format(valueOne));
                }
                valueOne = Double.NaN;
                CURRENT_ACTION = '0';
            }
        });
        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editText.getText().length() > 0) {
                    CharSequence currentText = editText.getText();
                    editText.setText(currentText.subSequence(0, currentText.length() - 1));
                } else {
                    valueOne = Double.NaN;
                    valueTwo = Double.NaN;
                    editText.setText("");
                    displayText.setText("");
                }
            }
        });

        buttonSIN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                computeCalculation();
                if (Double.isNaN(valueOne)) {
                    Toast.makeText(AdvancedActivity.this, "No Value", Toast.LENGTH_SHORT).show();
                } else {
                    CURRENT_ACTION = SINUS;
                    displayText.setText("sin(" + decimalFormat.format(valueOne) + ")");
                    editText.setText(null);

                }
            }
        });

        buttonCOS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                computeCalculation();
                if (Double.isNaN(valueOne)) {
                    Toast.makeText(AdvancedActivity.this, "No Value", Toast.LENGTH_SHORT).show();
                } else {
                    CURRENT_ACTION = COSIN;
                    displayText.setText("cos(" + decimalFormat.format(valueOne) + ")");
                    editText.setText(null);
                }
            }

        });
        buttonTAN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                computeCalculation();
                if (Double.isNaN(valueOne)) {
                    Toast.makeText(AdvancedActivity.this, "No Value", Toast.LENGTH_SHORT).show();
                } else {
                    CURRENT_ACTION = TAN;
                    displayText.setText("tan(" + decimalFormat.format(valueOne) + ")");
                    editText.setText(null);
                }
            }
        });
        buttonLN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                computeCalculation();
                if (Double.isNaN(valueOne)) {
                    Toast.makeText(AdvancedActivity.this, "No Value", Toast.LENGTH_SHORT).show();
                } else {
                    CURRENT_ACTION = LN;
                    displayText.setText("ln(" + decimalFormat.format(valueOne) + ")");
                    editText.setText(null);
                }
            }
        });
        buttonSQRT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                computeCalculation();
                if (Double.isNaN(valueOne)) {
                    Toast.makeText(AdvancedActivity.this, "No Value", Toast.LENGTH_SHORT).show();
                } else {
                    CURRENT_ACTION = SQRT;
                    displayText.setText("sqrt(" + decimalFormat.format(valueOne) + ")");
                    editText.setText(null);
                }
            }
        });
        buttonXTo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                computeCalculation();
                if (Double.isNaN(valueOne)) {
                    Toast.makeText(AdvancedActivity.this, "No Value", Toast.LENGTH_SHORT).show();
                } else {
                    CURRENT_ACTION = POW;
                    displayText.setText(decimalFormat.format(valueOne) + "^2");
                    editText.setText(null);
                }
            }
        });
        buttonXToY.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                computeCalculation();
                if (Double.isNaN(valueOne)) {
                    Toast.makeText(AdvancedActivity.this, "No Value", Toast.LENGTH_SHORT).show();
                } else {
                    CURRENT_ACTION = POWT;
                    displayText.setText(decimalFormat.format(valueOne) + "^");
                    editText.setText(null);
                }
            }
        });
        buttonLOG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                computeCalculation();
                if (Double.isNaN(valueOne)) {
                    Toast.makeText(AdvancedActivity.this, "No Value", Toast.LENGTH_SHORT).show();
                } else {
                    CURRENT_ACTION = LOG;
                    displayText.setText("log10(" + decimalFormat.format(valueOne) + ")");
                    editText.setText(null);
                }
            }
        });
        buttonpr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                computeCalculation();
                if (Double.isNaN(valueOne)) {
                    Toast.makeText(AdvancedActivity.this, "No Value", Toast.LENGTH_SHORT).show();
                } else {
                    CURRENT_ACTION = PR;
                    displayText.setText(decimalFormat.format(valueOne) + "%");
                    editText.setText(null);
                }
            }
        });

    }

    private void computeCalculation() {
        if(!Double.isNaN(valueOne)) {
            try {
                valueTwo = Double.parseDouble(editText.getText().toString());
                editText.setText(null);
            }catch(Exception e){
                e.printStackTrace();
            }

            if(CURRENT_ACTION == ADDITION)
                valueOne = this.valueOne + valueTwo;
            else if(CURRENT_ACTION == SUBTRACTION)
                valueOne = this.valueOne - valueTwo;
            else if(CURRENT_ACTION == MULTIPLICATION)
                valueOne = this.valueOne * valueTwo;
            else if(CURRENT_ACTION == DIVISION) {
                if (valueTwo == 0)
                    Toast.makeText(this, "Invalid Value", Toast.LENGTH_SHORT).show();
                else
                valueOne = this.valueOne / valueTwo;
            }
            else if(CURRENT_ACTION == SINUS)
                valueOne = Math.sin(Math.toRadians(this.valueOne));
            else if(CURRENT_ACTION == COSIN)
                valueOne = Math.cos(Math.toRadians(this.valueOne));
            else if(CURRENT_ACTION == TAN)
                valueOne = Math.tan(Math.toRadians(this.valueOne));
            else if (CURRENT_ACTION == LN) {
                if (valueOne <= 0)
                    Toast.makeText(this, "Invalid Value", Toast.LENGTH_SHORT).show();
                    else
                    valueOne = Math.log(this.valueOne);
            }
            else if (CURRENT_ACTION == LOG){
                if(valueOne <=0) Toast.makeText(this, "Invalid Value", Toast.LENGTH_SHORT).show();
                else
                    valueOne = Math.log10(this.valueOne);
            }
            else if(CURRENT_ACTION == SQRT){
                if(valueOne <=0 ) Toast.makeText(this, "Invalid Value", Toast.LENGTH_SHORT).show();
                else
                    valueOne = Math.sqrt(this.valueOne);
            }
            else if (CURRENT_ACTION == POW)
                valueOne = Math.pow(this.valueOne,2);

            else if(CURRENT_ACTION == POWT)
                valueOne = Math.pow(this.valueOne,valueTwo);
            else if(CURRENT_ACTION == PR)
                valueOne = this.valueOne/100;
            } else {
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


    private void readText(TextView text ){

        if(text.getText().toString().contains(ADDITION+"")){
            CURRENT_ACTION = ADDITION;
        }


    }
}


