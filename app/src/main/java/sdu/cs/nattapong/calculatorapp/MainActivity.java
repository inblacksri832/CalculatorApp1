package sdu.cs.nattapong.calculatorapp;

import android.arch.lifecycle.ViewModelProvider;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText number1 = findViewById(R.id.edtNumber1);
        final EditText number2 = findViewById(R.id.edtNumber2);
        Button plus = findViewById(R.id.bt1);
        Button minus = findViewById(R.id.bt2);
        Button multiply = findViewById(R.id.bt3);
        Button divide = findViewById(R.id.bt4);
        final TextView resultTextView = findViewById(R.id.tvResult);

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1 = Integer.parseInt(number1.getText().toString());
                int num2 = Integer.parseInt(number2.getText().toString());
                int result = num1 + num2;
                resultTextView.setText(result + "");
            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1 = Integer.parseInt(number1.getText().toString());
                int num2 = Integer.parseInt(number2.getText().toString());
                int result = num1 - num2;
                resultTextView.setText(result + "");
            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1 = Integer.parseInt(number1.getText().toString());
                int num2 = Integer.parseInt(number2.getText().toString());
                int result = num1 * num2;
                resultTextView.setText(result + "");
            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1 = Integer.parseInt(number1.getText().toString());
                int num2 = Integer.parseInt(number2.getText().toString());
                int result = num1 / num2;
                resultTextView.setText(result + "");
            }
        });
    }//end onCreate
}//end class
