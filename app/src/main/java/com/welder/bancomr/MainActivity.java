package com.welder.bancomr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.welder.bancomr.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        binding.imgSaldo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaSaldo = new Intent(MainActivity.this, SaldoActivity.class);
                startActivity(telaSaldo);
            }
        });

        binding.imgFatura.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaFatura = new Intent(MainActivity.this, FaturaActivity.class);
                startActivity(telaFatura);
            }
        });

        binding.imgTransferencia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaTransferencia = new Intent(MainActivity.this, TransferenciaActivity.class);
                startActivity(telaTransferencia);
            }
        });

        binding.imgPoupanca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telapupanca = new Intent(MainActivity.this, PoupancaActivity.class);
                startActivity(telapupanca);
            }
        });
    }
}