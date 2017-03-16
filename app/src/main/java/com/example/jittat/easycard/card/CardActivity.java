package com.example.jittat.easycard.card;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.jittat.easycard.R;
import com.example.jittat.easycard.data.CardRepository;

public class CardActivity extends AppCompatActivity implements CardView {
    private CardPresenter presenter;
    private CardRepository cardRepository;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card);

        cardRepository = CardRepository.getInstance();
        presenter = new CardPresenter(cardRepository, this);
    }
}
