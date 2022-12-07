package com.welder.bancomr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.welder.bancomr.databinding.ActivityMainBinding;
import com.welder.bancomr.databinding.ActivitySaldoBinding;

public class SaldoActivity extends AppCompatActivity {

    private ActivitySaldoBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySaldoBinding.inflate(getLayoutInflater());
        getSupportActionBar().hide();
        setContentView(binding.getRoot());


        binding.toolbarsaldo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent voltartelasaldo = new Intent(SaldoActivity.this, MainActivity.class);
                startActivity(voltartelasaldo);
            }
        });


    }
}