package com.example.jittat.easycard.data;

import java.util.ArrayList;

/**
 * Created by jittat on 16/3/2560.
 */

public class CardRepository {
    private ArrayList<Card> cards;

    public CardRepository() {
        cards = new ArrayList<Card>();
    }

    public int getCardCount() {
        return cards.size();
    }

    public Card getCardAt(int index) {
        return cards.get(index);
    }

    public int save(Card card) {
        cards.add(card);
        return cards.size();
    }

    public void delete(int index) {
        cards.remove(index);
    }
}
