package com.example.jittat.easycard.data;

import java.util.ArrayList;

/**
 * Created by jittat on 16/3/2560.
 */

public class CardRepository {
    private ArrayList<Card> cards;

    static CardRepository singleInstance = null;

    static public CardRepository getInstance() {
        if(singleInstance == null) {
            singleInstance = new CardRepository();
        }
        return singleInstance;
    }

    public CardRepository() {
        cards = new ArrayList<Card>();

        // for early testing
        cards.add(new Card("CAT","a very cute animal"));
        cards.add(new Card("TIGER","a very big cat"));
        cards.add(new Card("ELEPHANT","a very big animal with a long nose"));
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
