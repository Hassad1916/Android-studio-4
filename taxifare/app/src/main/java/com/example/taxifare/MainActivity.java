package com.example.taxifare;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button)findViewById(R.id.button);
        button.setOnClickListener(texi);
    }
    private View.OnClickListener texi = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            DecimalFormat B = new DecimalFormat("0");
            EditText A = (EditText)findViewById(R.id.editTextTextPersonName);

            int basic = 75;

            double distance = Double.parseDouble(A.getText().toString());
            double count = basic + ((distance / 250) * 5);
            TextView cost = (TextView)findViewById(R.id.textView5);
            cost.setText(B.format(count) + "元");
        }
    };
}