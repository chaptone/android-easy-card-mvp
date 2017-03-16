package com.example.jittat.easycard.card;

import com.example.jittat.easycard.data.CardRepository;

/**
 * Created by jittat on 16/3/2560.
 */
public class CardPresenter {
    private CardRepository repository;
    private CardView view;

    public CardPresenter(CardRepository repository, CardView view) {
        this.repository = repository;
        this.view = view;
    }

    public void start() {
    }

    public void onCardClick() {
    }

    public void nextCard() {
    }

    public void previousCard() {
    }
}
