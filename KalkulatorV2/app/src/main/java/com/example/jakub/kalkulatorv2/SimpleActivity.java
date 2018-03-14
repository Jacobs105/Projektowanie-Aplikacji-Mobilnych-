package com.example.jakub.kalkulatorv2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Jakub on 2018-03-14.
 */



public class SimpleActivity extends AppCompatActivity {

    private TextView editText, displayText;
    private float valueOne;
    private float valueTwo;
    private boolean add, sub, mul, div, equ, c;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.simple_calculator);

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
                    valueOne = Float.parseFloat(editText.getText() + "");
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
                    valueOne = Float.parseFloat(editText.getText() + "");
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
                    valueOne = Float.parseFloat(editText.getText() + "");
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
                    valueOne = Float.parseFloat(editText.getText() + "");
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
                displayText.setText(editText.getText().toString() + valueTwo +"="+ valueOne);

                //valueOne = Float.NaN;
                add= false;
                sub=false;
                mul=false;
                div=false;

            }
        });
        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(editText.getText().length() >0){
                    CharSequence currentText = editText.getText();
                    editText.setText(currentText.subSequence(0,currentText.length()-1));
                }else{
                    valueOne = Float.NaN;
                    valueTwo = Float.NaN;
                    editText.setText("");
                    displayText.setText("");
                }
            }
        });
    }
    private void computeCalculation() {
        if(!Double.isNaN(valueOne)) {
            valueTwo = Float.parseFloat(editText.getText().toString());
            editText.setText(null);

            if(add)
                valueOne = this.valueOne + valueTwo;
            else if(sub)
                valueOne = this.valueOne - valueTwo;
            else if(mul)
                valueOne = this.valueOne * valueTwo;
            else if(div)
                valueOne = this.valueOne / valueTwo;
        }
        else {
            try {
                valueOne =  Float.parseFloat(editText.getText().toString());
            }
            catch (Exception e){}
        }
    }
}
