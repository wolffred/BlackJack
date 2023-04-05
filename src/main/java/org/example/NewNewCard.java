package org.example;

public class NewNewCard {
    private final NewCardSuit suit;
    private final NewCardValue value;


    public NewNewCard(NewCardSuit suit, NewCardValue vvalue) {
        this.suit = suit;
        this.value = vvalue;
    }

    public int getVvalue(){
        return value.getValue();
    }

    public String toString() {
        return value.name() + " of " + suit.name();
    }
}

