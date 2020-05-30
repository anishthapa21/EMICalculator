package com.example.emicalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private EditText et1,et2,et3;
    private TextView tv_result;
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1= findViewById(R.id.loan_amount);
        et2= findViewById(R.id.interest_rate);
        et3=findViewById(R.id.Time);
        tv_result= findViewById(R.id.tv_result);
        btn = findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                emi();
            }
        });

    }

    private void emi(){
        float a,b,c,d;
        a=Float.parseFloat(et1.getText().toString());
        b=Float.parseFloat(et2.getText().toString())/(12*100);
        c=Float.parseFloat(et3.getText().toString())*12;
        d= Math.round((float) (a * b * Math.pow((1 + b), c) / (Math.pow((1 + b), c) - 1)));

        tv_result.setText("Your monthly EMI is ="+d);


    }


}
