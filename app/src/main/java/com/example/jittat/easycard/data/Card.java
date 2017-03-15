package com.example.jittat.easycard.data;

/**
 * Created by jittat on 16/3/2560.
 */

public class Card {
    private String title;
    private String description;

    public Card(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
