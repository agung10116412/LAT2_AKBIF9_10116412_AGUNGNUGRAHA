package com.example.lat2_akbif9_10116412_agungnugraha;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class main1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void register (View view){
        Intent intent = new Intent(main1.this,main2.class);
        startActivity(intent);
    }

}
