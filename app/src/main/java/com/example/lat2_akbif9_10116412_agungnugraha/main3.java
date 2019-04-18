package com.example.lat2_akbif9_10116412_agungnugraha;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class main3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }
    public void verify (View view ){
        Intent intent = new Intent(main3.this,main4.class);
        startActivity(intent);
    }

}
