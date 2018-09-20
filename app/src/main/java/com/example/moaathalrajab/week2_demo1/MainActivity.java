package com.example.moaathalrajab.week2_demo1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView mTv1;
    EditText mEt1;
    EditText mEt2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTv1=(TextView) findViewById(R.id.tv1);
        mEt1=(EditText) findViewById(R.id.ed1);
        mEt2=(EditText) findViewById(R.id.ed2);

    }

    public void read_name(View view) {
        mTv1.setText(""+
                (  Integer.parseInt(mEt1.getText().toString().trim())+
                        Integer.parseInt(mEt2.getText().toString().trim()))


        );
    }
}
