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
        Button plus = findViewById(R.id.btPlus);
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

    }//end onCreate
}//end class
