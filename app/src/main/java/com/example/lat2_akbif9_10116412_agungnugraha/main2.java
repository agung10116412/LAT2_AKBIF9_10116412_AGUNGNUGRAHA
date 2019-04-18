package com.example.lat2_akbif9_10116412_agungnugraha;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class main2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    public void almostthere(View view){
        Intent intent = new Intent(main2.this,main3.class);
        startActivity(intent);
    }

}
