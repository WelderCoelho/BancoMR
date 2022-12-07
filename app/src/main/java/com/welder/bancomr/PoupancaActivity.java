package com.welder.bancomr;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.welder.bancomr.databinding.ActivityPoupancaBinding;

public class PoupancaActivity extends AppCompatActivity {

    private ActivityPoupancaBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        binding = ActivityPoupancaBinding.inflate(getLayoutInflater());
        super.onCreate(savedInstanceState);
        setContentView(binding.getRoot());
        getSupportActionBar().hide();

        binding.toolpou.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent voltarmain = new Intent(PoupancaActivity.this, MainActivity.class);
                startActivity(voltarmain);
            }
        });
    }
}