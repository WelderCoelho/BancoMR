package com.welder.bancomr;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.vinaygaba.creditcardview.CardType;
import com.vinaygaba.creditcardview.CreditCardView;
import com.welder.bancomr.databinding.ActivityFaturaBinding;

public class FaturaActivity extends AppCompatActivity {

    private ActivityFaturaBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityFaturaBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().hide();




        binding.txttolfatura.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent voltarMainFatura = new Intent(FaturaActivity.this, MainActivity.class);
                startActivity(voltarMainFatura);
            }
        });

        CreditCardView cartaoDeCredito = binding.cartao;
        cartaoDeCredito.setCardNumber("5445 6544 5665 8797");
        cartaoDeCredito.setCardName("Welder Coelho");
        cartaoDeCredito.setExpiryDate("12/02");
        cartaoDeCredito.setType(CardType.MASTERCARD);



    }
}