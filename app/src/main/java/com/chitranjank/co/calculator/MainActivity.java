package com.chitranjank.co.calculator;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import org.mariuszgromada.math.mxparser.Expression;

import java.text.DecimalFormat;

//Use thi below library to easily solve mathematics expression. Library name: "MxParser library"

public class MainActivity extends AppCompatActivity {

    Expression expression;
    TextView inputText, resultText;
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, b00, bSin, bCos, bTan, bDot, bFact, bPow, bEqu, bDiv, bMultiply, bMinus, bPlus, bRoot, bClear, bPei;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputText = findViewById(R.id.input);
        resultText = findViewById(R.id.out_put);

        b0 = findViewById(R.id.btn0);
        b00 = findViewById(R.id.btnDoubleZero);
        b1 = findViewById(R.id.btn1);
        b2 = findViewById(R.id.btn2);
        b3 = findViewById(R.id.btn3);
        b4 = findViewById(R.id.btn4);
        b5 = findViewById(R.id.btn5);
        b6 = findViewById(R.id.btn6);
        b7 = findViewById(R.id.btn7);
        b8 = findViewById(R.id.btn8);
        b9 = findViewById(R.id.btn9);
        bSin = findViewById(R.id.btnSin);
        bCos = findViewById(R.id.btnCos);
        bTan = findViewById(R.id.btnTan);
        bDiv = findViewById(R.id.btnDiv);
        bMultiply = findViewById(R.id.btnMultiply);
        bPlus = findViewById(R.id.btnPlus);
        bMinus = findViewById(R.id.btnMinus);
        bClear = findViewById(R.id.btnClear);
        bDot = findViewById(R.id.btnDot);
        bEqu = findViewById(R.id.btnEqual);
        bFact = findViewById(R.id.btnFact);
        bPei = findViewById(R.id.btnPie);
        bRoot = findViewById(R.id.btnRoot);
        bPow = findViewById(R.id.btnPow);

        set_on_click_on_buttons();

    }

    private void set_on_click_on_buttons() {

        bClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String clear = inputText.getText().toString().trim();
                if (clear.length() != 0) {
                    clear = clear.substring(0, clear.length() - 1);
                    inputText.setText(clear);
                    solve_expression(clear);
                } else {
                    inputText.setText("");
                    resultText.setText("");
                }
            }
        });

        bRoot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputText.setText("√");
            }
        });
        bSin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputText.setText("sin(");
            }
        });
        bCos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputText.setText("cos(");
            }
        });
        bTan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputText.setText("tan(");
            }
        });

        bEqu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expression = new Expression(inputText.getText().toString());
                resultText.setText(String.valueOf(expression.calculate()));
                inputText.setText("");
            }
        });

        bPei.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputText.setText(inputText.getText().toString() + "3.14");
                String s = inputText.getText().toString().trim();
                if (s.contains("√")) {
                    inputText.setText("3.14");
                    s = inputText.getText().toString().trim();
                } else if (s.contains("sin(")) {
                    inputText.setText("3.14");
                    s = inputText.getText().toString().trim();
                } else if (s.contains("cos(")) {
                    inputText.setText("3.14");
                    s = inputText.getText().toString().trim();
                } else if (s.contains("tan(")) {
                    inputText.setText("3.14");
                    s = inputText.getText().toString().trim();
                }

                solve_expression(s);
            }
        });

        bPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputText.setText(inputText.getText().toString() + "+");
                String s = inputText.getText().toString().trim();
                if (s.contains("√")) {
                    inputText.setText("+");
                    s = inputText.getText().toString().trim();
                } else if (s.contains("sin(")) {
                    inputText.setText("+");
                    s = inputText.getText().toString().trim();
                } else if (s.contains("cos(")) {
                    inputText.setText("+");
                    s = inputText.getText().toString().trim();
                } else if (s.contains("tan(")) {
                    inputText.setText("+");
                    s = inputText.getText().toString().trim();
                }

                solve_expression(s);
            }
        });

        bMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputText.setText(inputText.getText().toString() + "-");
                String s = inputText.getText().toString().trim();
                if (s.contains("√")) {
                    inputText.setText("-");
                    s = inputText.getText().toString().trim();
                } else if (s.contains("sin(")) {
                    inputText.setText("-");
                    s = inputText.getText().toString().trim();
                } else if (s.contains("cos(")) {
                    inputText.setText("-");
                    s = inputText.getText().toString().trim();
                } else if (s.contains("tan(")) {
                    inputText.setText("-");
                    s = inputText.getText().toString().trim();
                }
                solve_expression(s);
            }
        });
        bMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputText.setText(inputText.getText().toString() + "×");
                String s = inputText.getText().toString().trim();
                if (s.contains("√")) {
                    inputText.setText("×");
                    s = inputText.getText().toString().trim();
                } else if (s.contains("sin(")) {
                    inputText.setText("×");
                    s = inputText.getText().toString().trim();
                } else if (s.contains("cos(")) {
                    inputText.setText("×");
                    s = inputText.getText().toString().trim();
                } else if (s.contains("tan(")) {
                    inputText.setText("×");
                    s = inputText.getText().toString().trim();
                }
                solve_expression(s);
            }
        });

        bDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputText.setText(inputText.getText().toString() + "÷");
                String s = inputText.getText().toString().trim();
                if (s.contains("√")) {
                    inputText.setText("÷");
                    s = inputText.getText().toString().trim();
                } else if (s.contains("sin(")) {
                    inputText.setText("÷");
                    s = inputText.getText().toString().trim();
                } else if (s.contains("cos(")) {
                    inputText.setText("÷");
                    s = inputText.getText().toString().trim();
                } else if (s.contains("tan(")) {
                    inputText.setText("÷");
                    s = inputText.getText().toString().trim();
                }
                solve_expression(s);
            }
        });

        bPow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputText.setText(inputText.getText().toString() + "^");
                String s = inputText.getText().toString().trim();
                if (s.contains("√")) {
                    inputText.setText("^");
                    s = inputText.getText().toString().trim();
                } else if (s.contains("sin(")) {
                    inputText.setText("^");
                    s = inputText.getText().toString().trim();
                } else if (s.contains("cos(")) {
                    inputText.setText("^");
                    s = inputText.getText().toString().trim();
                } else if (s.contains("tan(")) {
                    inputText.setText("^");
                    s = inputText.getText().toString().trim();
                }
                solve_expression(s);
            }
        });

        bDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputText.setText(inputText.getText().toString() + ".");
                String s = inputText.getText().toString().trim();
                if (s.contains("√")) {
                    inputText.setText(".");
                    s = inputText.getText().toString().trim();
                } else if (s.contains("sin(")) {
                    inputText.setText(".");
                    s = inputText.getText().toString().trim();
                } else if (s.contains("cos(")) {
                    inputText.setText(".");
                    s = inputText.getText().toString().trim();
                } else if (s.contains("tan(")) {
                    inputText.setText(".");
                    s = inputText.getText().toString().trim();
                }
                solve_expression(s);
            }
        });

        bFact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputText.setText(inputText.getText().toString() + "!");
                String s = inputText.getText().toString().trim();

                if (s.contains("√")) {
                    inputText.setText("!");
                    s = inputText.getText().toString().trim();
                } else if (s.contains("sin(")) {
                    inputText.setText("!");
                    s = inputText.getText().toString().trim();
                } else if (s.contains("cos(")) {
                    inputText.setText("!");
                    s = inputText.getText().toString().trim();
                } else if (s.contains("tan(")) {
                    inputText.setText("!");
                    s = inputText.getText().toString().trim();
                }

                solve_expression(s);
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputText.setText(inputText.getText().toString() + "1");
                String s = inputText.getText().toString().trim();
                solve_expression(s);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputText.setText(inputText.getText().toString() + "2");
                String s = inputText.getText().toString().trim();
                solve_expression(s);

            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputText.setText(inputText.getText().toString() + "3");
                String s = inputText.getText().toString().trim();
                solve_expression(s);

            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputText.setText(inputText.getText().toString() + "4");
                String s = inputText.getText().toString().trim();
                solve_expression(s);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputText.setText(inputText.getText().toString() + "5");
                String s = inputText.getText().toString().trim();
                solve_expression(s);
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputText.setText(inputText.getText().toString() + "6");
                String s = inputText.getText().toString().trim();
                solve_expression(s);
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputText.setText(inputText.getText().toString() + "7");
                String s = inputText.getText().toString().trim();
                solve_expression(s);
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputText.setText(inputText.getText().toString() + "8");
                String s = inputText.getText().toString().trim();
                solve_expression(s);
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputText.setText(inputText.getText().toString() + "9");
                String s = inputText.getText().toString().trim();
                solve_expression(s);
            }
        });

        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputText.setText(inputText.getText().toString() + "0");
                String s = inputText.getText().toString().trim();
                solve_expression(s);
            }
        });

        b00.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputText.setText(inputText.getText().toString() + "00");
                String s = inputText.getText().toString().trim();
                solve_expression(s);
            }
        });

    }

    @SuppressLint("SetTextI18n")
    private void solve_expression(String s) {
        if (!s.trim().isEmpty()) {
            if (s.contains("√")) {
                s = s.replace("√", "");
                double d = Math.sqrt(Double.parseDouble(s));
                resultText.setText(DecimalFormat.getInstance().format(d));
                inputText.setText("√" + s);
            } else if (s.contains("sin(")) {
                s = s.replace("sin(", "");
                if (!s.trim().isEmpty()) {
                    double sin = Math.sin(Math.toRadians(Double.parseDouble(s)));
                    resultText.setText(String.valueOf(sin));
                    inputText.setText("sin(" + s);
                }
            } else if (s.contains("cos(")) {
                s = s.replace("cos(", "");
                if (!s.trim().isEmpty()) {
                    double sin = Math.cos(Math.toRadians(Double.parseDouble(s)));
                    resultText.setText(String.valueOf(sin));
                    inputText.setText("cos" + s);
                }
            } else if (s.contains("tan(")) {
                s = s.replace("tan(", "");
                if (!s.trim().isEmpty()) {
                    double sin = Math.tan(Math.toRadians(Double.parseDouble(s)));
                    resultText.setText(String.valueOf(sin));
                    inputText.setText("tan(" + s);
                }
            } else {
                s = s.replace("÷", "/");
                s = s.replace("×", "*");
                s = s.replace(",", "");
                s = s.replace("..", ".");

                expression = new Expression(s);
                String result = String.valueOf(expression.calculate());

                resultText.setText(result);
            }
        } else {
            Toast.makeText(this, "Invalid expression", Toast.LENGTH_LONG).show();
        }
    }
}