package com.example.counterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener  {

    TextView tv_counter;
    Button btn_plus, btn_minus, btn_reset;
    Integer counter = 0;
    View main;

    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initiate Variable
        main = findViewById(R.layout.activity_main);
        tv_counter = findViewById(R.id.tvCount);
        btn_plus = findViewById(R.id.btnPlus);
        btn_minus = findViewById(R.id.btnMinus);
        btn_reset = findViewById(R.id.btnReset);

        // onclick
        btn_plus.setOnClickListener(this);
        btn_minus.setOnClickListener(this);
        btn_reset.setOnClickListener(this);


        // Anonymous OnClickListener
//        btn_plus.setOnClickListener(new View.OnClickListener() {
//            @SuppressLint("SetTextI18n")
//            @Override
//            public void onClick(View view) {
//                tv_counter.setText((++counter).toString());
//            }
//        });
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnPlus:
                counter++;
                tv_counter.setText(counter.toString());
                break;
            case R.id.btnMinus:
                counter--;
                tv_counter.setText(counter.toString());
                break;
            case R.id.btnReset:
                counter = 0;
                tv_counter.setText(counter.toString());
                break;
            default:
                break;
        }
    }

//    @SuppressLint({"SetTextI18n", "ClickableViewAccessibility"})
//    @Override
//    public boolean onTouch(View view, MotionEvent motionEvent) {
//        switch (motionEvent.getAction()){
//            case MotionEvent.ACTION_DOWN:
//            tv_counter.setText((++counter).toString());
//            break;
//        }
//            return true;
//    }

//    @SuppressLint("SetTextI18n")
//    @Override
//    public void onClick(View view) {
//        tv_counter.setText((++counter).toString());
//    }
}
