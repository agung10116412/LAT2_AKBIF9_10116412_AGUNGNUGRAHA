package com.example.lat2_akbif9_10116412_agungnugraha;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class main4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acivity_main4);
    }
    public void Home(View view){
        Intent intent = new Intent(main4.this,main5.class);
        startActivity(intent);
    }
}
