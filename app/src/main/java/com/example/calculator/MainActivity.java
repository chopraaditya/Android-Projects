package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.Settings;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




    }

    public void calculate(View view) {

        EditText num1  = (EditText) findViewById(R.id.num1View);
        EditText num2 = (EditText) findViewById(R.id.num2View);
        TextView result = (TextView) findViewById(R.id.resultVIew);


        String mynum1=num1.getText().toString();
        final int mnum1=Integer.parseInt(mynum1);

        String mynum2=num2.getText().toString();
        final int mnum2=Integer.parseInt(mynum2);

        Spinner spinner1 = (Spinner) findViewById(R.id.spinner1);

        String op = String.valueOf(spinner1.getSelectedItem());

        System.out.println(op);
        if(op.equals("Addition")) {
            int answer = mnum1 + mnum2;
            result.setText(String.valueOf(answer));
        }
        if(op.equals("Subtraction")) {
            int answer = mnum1 - mnum2;
            result.setText(String.valueOf(answer));
        }
        if(op.equals("Multiplication")) {
            int answer = mnum1 * mnum2;
            result.setText(String.valueOf(answer));
        }
        if(op.equals("Division")) {
            int answer = mnum1 / mnum2;
            result.setText(String.valueOf(answer));
        }


    }

    public void Reset(View view) {

        EditText num1  = (EditText) findViewById(R.id.num1View);
        EditText num2 = (EditText) findViewById(R.id.num2View);
        TextView result = (TextView) findViewById(R.id.resultVIew);

        num1.setText("");
        num2.setText("");
        result.setText("");

        num1.setHint(R.string.enter_first_number);
        num2.setHint(R.string.enter_second_number);
        result.setHint(R.string.result);

    }
}
