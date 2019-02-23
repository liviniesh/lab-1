package com.example.mycalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    double num, num1, num2, num3, num4, num5, n1, n2, n3, n4, n5, n6, n7, no1, no2, no3, no4, no5;
    Button btn3, btn4, btn6, btn7, btn8, btn9;
    EditText meter, inch, feet, yards, miles, nautical, kg, ounces, pounds, troy, stones, shorttone,
            longtone, liters, fluid, quarts, gallons, imperial;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn3 = findViewById(R.id.button3);
        btn4 = findViewById(R.id.button4);
        meter = findViewById(R.id.editText4);
        inch = findViewById(R.id.editText5);
        feet = findViewById(R.id.editText6);
        yards = findViewById(R.id.editText8);
        miles = findViewById(R.id.editText9);
        nautical = findViewById(R.id.editText10);


        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (meter.isFocused()) {

                   num = Double.parseDouble(meter.getText().toString());
                    double r1 = num * 39.3701;
                    double r2 = num * 3.28084;
                    double r3 = num * 1.09361;
                    double r4 = num * 0.000621371;
                    double r5 = num * 0.000539957;

                    inch.setText("" + r1);
                    feet.setText("" + r2);
                    miles.setText("" + r4);
                    yards.setText("" + r3);
                    nautical.setText("" + r5);

                } else if (inch.isFocused()) {

                    num1 = Double.parseDouble(inch.getText().toString());
                    double r6 = num1 * 0.0254;
                    double r7 = num1 * 0.0833333;
                    double r8 = num1 * 0.000015783;
                    double r9 = num1 * 0.0277778;
                    double r10 = num1 * 0.000013715;

                    meter.setText("" + r6);
                    feet.setText("" + r7);
                    miles.setText("" + r8);
                    yards.setText("" + r9);
                    nautical.setText("" + r10);

                } else if (feet.isFocused()) {

                    num2 = Double.parseDouble(feet.getText().toString());
                    double r11 = num2 * 0.3048;
                    double r12 = num2 * 12;
                    double r13 = num2 * 0.000189394;
                    double r14 = num2 * 0.333333;
                    double r15 = num2 * 0.000164579;

                    meter.setText("" + r11);
                    inch.setText("" + r12);
                    miles.setText("" + r13);
                    yards.setText("" + r14);
                    nautical.setText("" + r15);

                } else if (yards.isFocused()) {

                    num3 = Double.parseDouble(yards.getText().toString());
                    double s1 = num3 * 0.9144;
                    double s2 = num3 * 36;
                    double s3 = num3 * 0.000568182;
                    double s4 = num3 * 3;
                    double s5 = num3 * 0.000493737;

                    meter.setText("" + s1);
                    inch.setText("" + s2);
                    miles.setText("" + s3);
                    feet.setText("" + s4);
                    nautical.setText("" + s5);

                } else if (miles.isFocused()) {

                    num4 = Double.parseDouble(miles.getText().toString());
                    double s6 = num4 * 1609.34;
                    double s7 = num4 * 63360;
                    double s8 = num4 * 1760;
                    double s9 = num4 * 5280;
                    double s10 = num4 * 0.868976;

                    meter.setText("" + s6);
                    inch.setText("" + s7);
                    yards.setText("" + s8);
                    feet.setText("" + s9);
                    nautical.setText("" + s10);

                } else if (nautical.isFocused()) {

                    num5 = Double.parseDouble(nautical.getText().toString());
                    double s11 = num5 * 1852;
                    double s12 = num5 * 72913.4;
                    double s13 = num5 * 1.15078;
                    double s14 = num5 * 6076.12;
                    double s15 = num5 * 2025.37;

                    meter.setText("" + s11);
                    inch.setText("" + s12);
                    miles.setText("" + s13);
                    feet.setText("" + s14);
                    yards.setText("" + s15);



            }else if(meter.length()==0 ||inch.length()==0 ||miles.length()==0 ||feet.length()==0 ||yards.length()==0 ||nautical.length()==0){
                    Toast.makeText(MainActivity.this, "Enter Any Value", Toast.LENGTH_LONG).show();

                }
            }


        }
        );

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                meter.getText().clear();
                nautical.getText().clear();
                miles.getText().clear();
                yards.getText().clear();
                feet.getText().clear();
                inch.getText().clear();
            }
        }
        );

        btn6 = findViewById(R.id.button6);
        btn7 = findViewById(R.id.button7);
        kg = findViewById(R.id.editText11);
        ounces = findViewById(R.id.editText12);
        pounds = findViewById(R.id.editText13);
        troy = findViewById(R.id.editText2);
        stones = findViewById(R.id.editText);
        shorttone = findViewById(R.id.editText15);
        longtone= findViewById(R.id.editText16);


        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 if (kg.isFocused()) {

                    n1 = Double.parseDouble(kg.getText().toString());
                    double t1 = n1 * 35.274;
                    double t2 = n1 * 2.20462;
                    double t3 = n1 * 2.6792;
                    double t4 = n1 * 0.157473;
                    double t5 = n1 * 0.00110231;
                    double t6 = n1 * 0.000984207;

                    ounces.setText("" + t1);
                    pounds.setText("" + t2);
                    troy.setText("" + t4);
                    stones.setText("" + t3);
                    shorttone.setText("" + t5);
                    longtone.setText("" + t6);

                } else if (ounces.isFocused()) {

                    n2 = Double.parseDouble(ounces.getText().toString());
                    double t7 = n2 * 0.0283495;
                    double t8 = n2 * 0.0625;
                    double t9 = n2 * 0.075955;
                    double t10 = n2 * 0.00446429;
                    double t11 = n2 * 0.00002835;
                    double t12 = n2 * 0.000027902;

                    kg.setText("" + t7);
                    pounds.setText("" + t8);
                    troy.setText("" + t9);
                    stones.setText("" + t10);
                    shorttone.setText("" + t11);
                    longtone.setText("" + t12);


                } else if (pounds.isFocused()) {

                    n3 = Double.parseDouble(pounds.getText().toString());

                    double t13 = n3 * 0.453592;
                    double t14 = n3 * 16;
                    double t15 = n3 * 14.583;
                    double t16 = n3 * 0.0714286;
                    double t17 = n3 * 0.000453592;
                    double t18 = n3 * 0.000446429;

                    kg.setText("" + t13);
                    ounces.setText("" + t14);
                    troy.setText("" + t15);
                    stones.setText("" + t16);
                    shorttone.setText("" + t17);
                    longtone.setText("" + t18);

                } else if (troy.isFocused()) {

                    n4 = Double.parseDouble(troy.getText().toString());

                    double a1 = n4 * 0.373;
                    double a2 = n4 * 13.166;
                    double a3 = n4 * 0.82286;
                    double a4 = n4 * 0.058776;
                    double a5 = n4 * 0.00041143;
                    double a6 = n4 * 0.00036735;

                    kg.setText("" + a1);
                    ounces.setText("" + a2);
                    pounds.setText("" + a3);
                    stones.setText("" + a4);
                    shorttone.setText("" + a5);
                    longtone.setText("" + a6);

                } else if (stones.isFocused()) {

                    n5 = Double.parseDouble(stones.getText().toString());

                    double a7 = n5 * 6.35029;
                    double a8 = n5 * 224;
                    double a9 = n5 * 14;
                    double a10 = n5 * 17.014;
                    double a11 = n5 * 0.00635029;
                    double a12 = n5 * 0.00625;

                    kg.setText("" + a7);
                    ounces.setText("" + a8);
                    pounds.setText("" + a9);
                    troy.setText("" + a10);
                    shorttone.setText("" + a11);
                    longtone.setText("" + a12);

                } else if (shorttone.isFocused()) {

                    n6 = Double.parseDouble(shorttone.getText().toString());

                    double b1 = n6 * 1000;
                    double b2 = n6 * 35274;
                    double b3 = n6 * 2204.62;
                    double b4 = n6 * 2500;
                    double b5 = n6 * 157.473;
                    double b6 = n6 * 0.984207;

                    kg.setText("" + b1);
                    ounces.setText("" + b2);
                    pounds.setText("" + b3);
                    troy.setText("" + b4);
                    stones.setText("" + b5);
                    longtone.setText("" + b6);

                } else if (longtone.isFocused()) {

                     n7 = Double.parseDouble(longtone.getText().toString());

                     double b7 = n7 * 1016.05;
                     double b8 = n7 * 35840;
                     double b9 = n7 * 2240;
                     double b10 = n7 * 2777.78;
                     double b11 = n7 * 160;
                     double b12 = n7 * 1.01605;

                     kg.setText("" + b7);
                     ounces.setText("" + b8);
                     pounds.setText("" + b9);
                     troy.setText("" + b10);
                     stones.setText("" + b11);
                     shorttone.setText("" + b12);
                 }else if(kg.length()==0 ||ounces.length()==0 ||pounds.length()==0 ||troy.length()==0 ||stones.length()==0 ||shorttone.length()==0 ||longtone.length()==0){
                     Toast.makeText(MainActivity.this, "Enter Any Value", Toast.LENGTH_LONG).show();

                 }
            }
        }
        );

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                kg.getText().clear();
                ounces.getText().clear();
                pounds.getText().clear();
                troy.getText().clear();
                stones.getText().clear();
                shorttone.getText().clear();
                longtone.getText().clear();
            }
        }
        );

        btn8 = findViewById(R.id.button8);
        btn9 = findViewById(R.id.button9);
        liters = findViewById(R.id.editText17);
        fluid = findViewById(R.id.editText18);
        quarts = findViewById(R.id.editText19);
        gallons = findViewById(R.id.editText20);
        imperial = findViewById(R.id.editText21);


        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (liters.isFocused()) {

                    no1 = Double.parseDouble(liters.getText().toString());
                    double x1 = no1 / 0.029574;
                    double x2 = no1 / 0.946353;
                    double x3 = no1 / 3.785411;
                    double x4 = no1 / 4.546092;

                    fluid.setText("" + x1);
                    quarts.setText("" + x2);
                    gallons.setText("" + x4);
                    imperial.setText("" + x3);

                } else if (fluid.isFocused()) {

                    no2 = Double.parseDouble(fluid.getText().toString());
                    double x5 = no2 * 0.0295735;
                    double x6 = no2 / 32;
                    double x7 = no2 / 128;
                    double x8 = no2 * 0.00650526;

                    liters.setText("" + x5);
                    quarts.setText("" + x6);
                    gallons.setText("" + x7);
                    imperial.setText("" + x8);

                } else if (quarts.isFocused()) {

                    no3 = Double.parseDouble(quarts.getText().toString());

                    double x9 = no3  * 0.9463529;
                    double x10 = no3 * 32;
                    double x11 = no3 / 4;
                    double x12 = no3 * 0.2081685;

                    liters.setText("" + x9);
                    fluid.setText("" + x10);
                    gallons.setText("" + x11);
                    imperial.setText("" + x12);

                } else if (gallons.isFocused()) {

                    no4 = Double.parseDouble(gallons.getText().toString());

                    double y1 = no4 * 3.785412;
                    double y2 = no4 * 128;
                    double y3 = no4 * 4;
                    double y4 = no4 * 0.832674;

                    liters.setText("" + y1);
                    fluid.setText("" + y2);
                    quarts.setText("" + y3);
                    imperial.setText("" + y4);

                } else if (imperial.isFocused()) {

                    no5 = Double.parseDouble(imperial.getText().toString());

                    double y5 = no5 * 4.54609;
                    double y6 = no5 / 0.00651;
                    double y7 = no5 / 0.20817;
                    double y8 = no5 / 0.83267;

                    liters.setText("" + y5);
                    fluid.setText("" + y6);
                    quarts.setText("" + y7);
                    gallons.setText("" + y8);



                }else if(liters.length()==0 ||fluid.length()==0 ||quarts.length()==0 ||gallons.length()==0 ||imperial.length()==0){
                    Toast.makeText(MainActivity.this, "Enter Any Value", Toast.LENGTH_LONG).show();

                }

            }
        }
        );

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v){

                liters.getText().clear();
                fluid.getText().clear();
                quarts.getText().clear();
                gallons.getText().clear();
                imperial.getText().clear();

            }
        }
        );
    }
}