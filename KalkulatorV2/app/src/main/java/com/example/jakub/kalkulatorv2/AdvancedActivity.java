package com.example.jakub.kalkulatorv2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


/**
 * Created by Jakub on 2018-03-15.
 */

public class AdvancedActivity extends AppCompatActivity{

    private TextView editText, displayText;
    private double valueOne;
    private double valueTwo;
    private boolean add, sub, mul, div,sin,cos,tan,ln,sqrt,xto2,xtoy,log ,equ, c;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.advanced_calculator);

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


        displayText = findViewById(R.id.displayText);
        editText = findViewById(R.id.editText);


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
        buttonADD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editText == null) {
                    editText.setText("");
                } else {
                    valueOne = Double.parseDouble(editText.getText() + "");
                    add = true;
                    displayText.setText(valueOne + " + ");
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
                    valueOne = Double.parseDouble(editText.getText() + "");
                    sub = true;
                    displayText.setText(valueOne + " - ");
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
                    valueOne = Double.parseDouble(editText.getText() + "");
                    mul = true;
                    displayText.setText(valueOne + " * ");
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
                    valueOne = Double.parseDouble(editText.getText() + "");
                    div = true;
                    displayText.setText(valueOne + " / ");
                    editText.setText(null);

                }
            }
        });
        buttonEQU.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                computeCalculation();
                displayText.setText(editText.getText().toString()+ valueOne);

                //valueOne = Float.NaN;
                add= false;
                sub=false;
                mul=false;
                div=false;
                sin=false;
                cos= false;
                tan=false;
                ln=false;
                sqrt = false;
                xto2= false;
                xtoy= false;
                log = false;


            }
        });
        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(editText.getText().length() >0){
                    CharSequence currentText = editText.getText();
                    editText.setText(currentText.subSequence(0,currentText.length()-1));
                }else{
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
                if (editText == null) {
                    editText.setText("");
                } else {
                    valueOne = Double.parseDouble(editText.getText() + "");
                    sin = true;
                    displayText.setText("sin("+valueOne+")");
                    editText.setText(null);

                }
            }
        });

        buttonCOS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editText == null) {
                    editText.setText("");
                } else {
                    valueOne = Double.parseDouble(editText.getText() + "");
                    cos = true;
                    displayText.setText("cos("+valueOne+")");
                    editText.setText(null);

                }
            }
        });
        buttonTAN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editText == null) {
                    editText.setText("");
                } else {
                    valueOne = Double.parseDouble(editText.getText() + "");
                    tan = true;
                    displayText.setText("tan("+valueOne+")");
                    editText.setText(null);

                }
            }
        });
        buttonLN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editText == null) {
                    editText.setText("");
                } else {
                    valueOne = Double.parseDouble(editText.getText() + "");
                    ln = true;
                    displayText.setText("ln("+valueOne+")");
                    editText.setText(null);

                }
            }
        });
        buttonSQRT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editText == null) {
                    editText.setText("");
                } else {
                    valueOne = Double.parseDouble(editText.getText() + "");
                    sqrt = true;
                    displayText.setText("sqrt("+valueOne+")");
                    editText.setText(null);

                }
            }
        });
        buttonXTo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editText == null) {
                    editText.setText("");
                } else {
                    valueOne = Double.parseDouble(editText.getText() + "");
                    xto2 = true;
                    displayText.setText(valueOne+"^2");
                    editText.setText(null);

                }
            }
        });
        buttonXToY.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editText == null) {
                    editText.setText("");
                } else {
                    valueOne = Double.parseDouble(editText.getText() + "");
                    xtoy = true;
                    displayText.setText(valueOne+"^");
                    editText.setText(null);

                }
            }
        });
        buttonLOG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editText == null) {
                    editText.setText("");
                } else {
                    valueOne = Double.parseDouble(editText.getText() + "");
                    log = true;
                    displayText.setText("LOG("+valueOne+")");
                    editText.setText(null);

                }
            }
        });






    }
    private void computeCalculation() {
        if(!Double.isNaN(valueOne)) {
            valueTwo = Double.parseDouble(editText.getText().toString());
            editText.setText(null);

            if(add)
                valueOne = this.valueOne + valueTwo;
            else if(sub)
                valueOne = this.valueOne - valueTwo;
            else if(mul)
                valueOne = this.valueOne * valueTwo;
            else if(div)
                valueOne = this.valueOne / valueTwo;
            else if(sin)
                valueOne =  Math.sin(this.valueOne);
            else if(cos)
                valueOne =  Math.cos(this.valueOne);
            else if(tan)
                valueOne =  Math.tan(this.valueOne);
            else if(ln)
                valueOne =  Math.log(this.valueOne);
            else  if(sqrt)
                valueOne =  Math.sqrt(this.valueOne);
            else if(xto2)
                valueOne *= valueOne;
            else  if (xtoy)
                valueOne =  Math.pow(this.valueOne,valueTwo);
            else if (log)
                valueOne =  Math.log10(this.valueOne);
        }
        else {
            try {
                valueOne =  Double.parseDouble(editText.getText().toString());
            }
            catch (Exception e){}
        }
    }
}


