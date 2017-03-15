package com.example.jittat.easycard.card;

/**
 * Created by jittat on 16/3/2560.
 */

public interface CardPresenter {
    void start();

    // interaction
    void onCardClick();

    // navigation
    void nextCard();
    void previousCard();
}
