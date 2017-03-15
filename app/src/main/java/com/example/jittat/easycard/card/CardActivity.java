package com.example.jittat.easycard.card;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.jittat.easycard.R;
import com.example.jittat.easycard.data.CardRepository;

public class CardActivity extends AppCompatActivity implements CardView {
    private CardPresenter presenter;
    private static CardRepository repository;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card);

        if(repository == null) {
            repository = new CardRepository();
        }

        presenter = new CardPresenterImpl(repository, this);
    }
}
