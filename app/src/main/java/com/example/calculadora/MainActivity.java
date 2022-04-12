package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    Button blimpar, b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, bvirgula, bmais, bigual, bmenos, bvezes, bdivisao, braiz, bseno, bcos, btg, bpotencia;
    TextView num, conta;
    String t = "", op = "";
    double num1, num2, res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            b1 = (Button)findViewById(R.id.btn1);
            b2 = (Button)findViewById(R.id.btn2);
            b3 = (Button)findViewById(R.id.btn3);
            b4 = (Button)findViewById(R.id.btn4);
            b5 = (Button)findViewById(R.id.btn5);
            b6 = (Button)findViewById(R.id.btn6);
            b7 = (Button)findViewById(R.id.btn7);
            b8 = (Button)findViewById(R.id.btn8);
            b9 = (Button)findViewById(R.id.btn9);
            b0 = (Button)findViewById(R.id.btn0);
            conta = (TextView)findViewById(R.id.tvconta);
            num = (TextView)findViewById(R.id.tvnum);
            blimpar = (Button)findViewById(R.id.btnlimpar);
            bvirgula = (Button)findViewById(R.id.btnvirgula);
            bigual = (Button)findViewById(R.id.btnigual);
            bmais = (Button)findViewById(R.id.btnmais);
            bmenos = (Button)findViewById(R.id.btnmenos);
            bvezes = (Button)findViewById(R.id.btnvezes);
            bdivisao = (Button)findViewById(R.id.btndivisao);
            braiz = (Button)findViewById(R.id.btnraiz);
            bpotencia = (Button)findViewById(R.id.btnpotencia);
            bseno = (Button)findViewById(R.id.btnseno);
            bcos = (Button)findViewById(R.id.btncos);
            btg = (Button)findViewById(R.id.btntg);
            num = (TextView)findViewById(R.id.tvnum);
            conta = (TextView)findViewById(R.id.tvconta);

       b1.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View v) {
                t = t+1;
                num.setText(t);
            }
        });

        b2.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View v) {
                t = t+2;
                num.setText(t);
            }
        });

        b3.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View v) {
                t = t+3;
                num.setText(t);
            }
        });

        b4.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View v) {
                t = t+4;
                num.setText(t);
            }
        });

        b5.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View v) {
                t = t+5;
                num.setText(t);
            }
        });

        b6.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View v) {
                t = t+6;
                num.setText(t);
            }
        });

        b7.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View v) {
                t = t+7;
                num.setText(t);
            }
        });

        b8.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View v) {
                t = t+8;
                num.setText(t);
            }
        });

        b9.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View v) {
                t = t+9;
                num.setText(t);
            }
        });

        b0.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View v) {
                t = t+0;
                num.setText(t);
            }
        });

        bvirgula.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View arg0) {
                if (t == "") {
                    t = "0";
                }

                t = t + ".";
                num.setText(t);
        }
        });

        bmais.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View arg0) {
                if(t != "") {
                    num1 = Double.parseDouble(num.getText().toString());
                    op = "+";
                    t = "";
                    num.setText(t);
                    conta.setText(num1 + " " + op);
                }
            }
        });

        bmenos.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View arg0) {
                if(t != "") {
                    num1 = Double.parseDouble(num.getText().toString());
                    op = "-";
                    t = "";
                    num.setText(t);
                    conta.setText(num1 + " " + op);
                }
            }
        });

        bvezes.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View arg0) {
                if(t != "") {
                    num1 = Double.parseDouble(num.getText().toString());
                    op = "x";
                    t = "";
                    num.setText(t);
                    conta.setText(num1 + " " + op);
                }
            }
        });

        bdivisao.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View arg0) {
                if(t != "") {
                    num1 = Double.parseDouble(num.getText().toString());
                    op = "/";
                    t = "";
                    num.setText(t);
                    conta.setText(num1 + " " + op);
                }
            }
        });

        bpotencia.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View arg0) {
                if(t != "") {
                    num1 = Double.parseDouble(num.getText().toString());
                    op = "^";
                    t = "";
                    num.setText(t);
                    conta.setText(num1 + " " + op);
                }
            }
        });

        braiz.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View arg0) {
                if(t != "") {
                    num1 = Double.parseDouble(num.getText().toString());
                    res = Math.sqrt(num1);
                    op = "√";
                    t = "";
                    num.setText(""+res);
                    conta.setText(op + " de " + num1 + " = " + res);
                }
            }
        });

        bseno.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View arg0) {
                if(t != "") {
                    num1 = Double.parseDouble(num.getText().toString());
                    res = Math.sin(num1);
                    op = "sen";
                    t = "";
                    num.setText(""+res);
                    conta.setText(op + " de " + num1 + " = " + res);
                }
            }
        });

        bcos.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View arg0) {
                if(t != "") {
                    num1 = Double.parseDouble(num.getText().toString());
                    res = Math.cos(num1);
                    op = "cos";
                    t = "";
                    num.setText(""+res);
                    conta.setText(op + " de " + num1 + " = " + res);
                }
            }
        });

        btg.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View arg0) {
                if(t != "") {
                    num1 = Double.parseDouble(num.getText().toString());
                    res = Math.tan(num1);
                    op = "tg";
                    t = "";
                    num.setText(" " + res);
                    conta.setText(op + " de " + num1 + " = " + res);
                }
            }
        });

        bigual.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                if (op != "") {
                    num2 = Double.parseDouble(num.getText().toString());

                    if (op == "+") {
                            res = num1 + num2;

                        } else if (op == "-") {
                            res = num1 - num2;

                        } else if (op == "x") {
                            res = num1 * num2;

                        } else if (op == "/") {
                            res = num1 / num2;

                        } else if (op == "^"){
                            res = Math.pow(num1, num2);
                        }

                    t.valueOf(res);
                    conta.setText( num1 + " " + op + " " + num2 + " = " + res);
                    num.setText(" " + res);
                }
            }
        });

        blimpar.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View v) {
                conta.setText("");
                num.setText("");
                res = 0;
                t = "";
                op = "";

            }
        });

    }
    }


