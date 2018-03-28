package com.example.jakub.kalkulatorv2;

import android.os.Bundle;
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
// TODO poprawic obsluge kilkuargumentowych operacji
public class AdvancedActivity extends AppCompatActivity{

    private TextView editText, displayText;
    private double valueOne;
    private double valueTwo;
    private boolean add, sub, mul, div,xtoy ,equ, c;
    private DecimalFormat df = new DecimalFormat("#.#####");
    private String myEditText;
    private String myDisplayText;

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


        buttonpr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valueOne = Double.parseDouble(String.valueOf(editText.getText()));
                valueOne = valueOne/100;
                displayText.setText(""+valueOne);
                valueOne = Double.NaN;
            }
        });

        buttonNG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double valueToNG = Double.parseDouble(String.valueOf(editText.getText()));
                if(valueToNG != Double.NaN){
                    valueToNG = -(valueToNG);
                    editText.setText(""+valueToNG);
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
                editText.setText(editText.getText()+".");
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
                xtoy= false;



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
                    displayText.setText("");
                    valueOne = Double.parseDouble(editText.getText() + "");
                    valueOne =  Math.sin(Math.toRadians(valueOne));
                    displayText.setText(""+df.format(valueOne));
                    editText.setText(null);
                    valueOne=Double.NaN;

                }
            }
        });

        buttonCOS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editText == null) {
                    editText.setText("");
                } else {
                    displayText.setText("");
                    valueOne = Double.parseDouble(editText.getText() + "");
                    valueOne =  Math.cos(Math.toRadians(valueOne));
                    displayText.setText(""+df.format(valueOne));
                    editText.setText(null);
                    valueOne=Double.NaN;
                }
            }
        });
        buttonTAN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editText == null) {
                    editText.setText("");
                } else {
                    displayText.setText("");
                    valueOne = Double.parseDouble(editText.getText() + "");
                    valueOne =  Math.tan(Math.toRadians(valueOne));
                    displayText.setText(""+df.format(valueOne));
                    editText.setText(null);
                    valueOne=Double.NaN;
                }
            }
        });
        buttonLN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editText == null) {
                    editText.setText("");
                } else {
                    if(valueOne >0) {
                        displayText.setText("");
                        valueOne = Double.parseDouble(editText.getText() + "");
                        valueOne = Math.log(valueOne);
                        displayText.setText("" + df.format(valueOne));
                        editText.setText(null);
                        valueOne = Double.NaN;
                    }else{
                        Toast.makeText(AdvancedActivity.this, "Invalid Operation", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
        buttonSQRT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editText == null) {
                    editText.setText("");
                } else {
                    displayText.setText("");
                    if(valueOne > 0) {
                        valueOne = Double.parseDouble(editText.getText() + "");
                        valueOne = Math.sqrt(valueOne);
                        displayText.setText("" + df.format(valueOne));
                        editText.setText(null);
                        valueOne = Double.NaN;
                    }else {
                        Toast.makeText(AdvancedActivity.this, "Invalid Operation", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
        buttonXTo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editText == null) {
                    editText.setText("");
                } else {
                    displayText.setText("");
                    valueOne = Double.parseDouble(editText.getText() + "");
                    valueOne *= valueOne;
                    displayText.setText(""+df.format(valueOne));
                    editText.setText(null);
                    valueOne=Double.NaN;
                }
            }
        });
        buttonXToY.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editText == null) {
                    editText.setText("");
                } else {
                    displayText.setText("");
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
                    if(valueOne >0) {
                        displayText.setText("");
                        valueOne = Double.parseDouble(editText.getText() + "");
                        valueOne = Math.log10(valueOne);
                        displayText.setText("" + df.format(valueOne));
                        editText.setText(null);
                        valueOne = Double.NaN;
                    }else{
                        Toast.makeText(AdvancedActivity.this, "Invalid Operation", Toast.LENGTH_SHORT).show();
                    }
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
            else if(div){
                if(valueTwo == 0){
                    Toast.makeText(this, "Invalid Operation", Toast.LENGTH_SHORT).show();
                }else
                    valueOne = this.valueOne / valueTwo;
            }

            else  if (xtoy)
                valueOne =  Math.pow(this.valueOne,valueTwo);


        }
        else {
            try {
                valueOne =  Double.parseDouble(editText.getText().toString());
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


