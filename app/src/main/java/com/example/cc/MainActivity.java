package com.example.cc;

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
        converterApp();
    }


    public void converterApp()
    {

        Button btn = (Button)findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText pk = (EditText)findViewById(R.id.pk);
                TextView tv = (TextView)findViewById(R.id.tv);

                float PKR = Float.parseFloat(pk.getText().toString());
                float res = PKR / 157;

                tv.setText(String.valueOf(res)+ " $");


            }
        });



    }
}
