package com.calcapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void operar(View view){
        Intent i = new Intent(this, OperationActivity.class);
        String txtOper = (String) view.getTag();//tomas el tag asignado
        i.putExtra("operador", txtOper);
        startActivity(i);
    }

}
