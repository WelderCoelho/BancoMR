package com.welder.bancomr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.welder.bancomr.databinding.ActivityTransferenciaBinding;

public class TransferenciaActivity extends AppCompatActivity {

    private ActivityTransferenciaBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityTransferenciaBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().hide();

        binding.tooltran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent voltarmain = new Intent(TransferenciaActivity.this, MainActivity.class);
                startActivity(voltarmain);
            }
        });
    }
}