package com.example.prajaktadesai.firstproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;


public class Main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }

    public void letsGo( View view){
        Intent intent=new Intent(this, SecondActivity.class);
        startActivity(intent);
        Toast toast=Toast.makeText(getApplicationContext(), "in second", Toast.LENGTH_LONG);
        toast.show();

    }

}
