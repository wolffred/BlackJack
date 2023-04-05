package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {



    @Test
    void testTotalNewCardValue() {

        // setup
        Player player1 = new Player("Player 1");
        Deck deck1 = new Deck("deck1");
        List<NewCard> deckOfCards = new ArrayList<>();




        //action
        deck1.generateCards(deckOfCards);

        deck1.setNewCardList(deckOfCards);

        deck1.shareCards(player1);

//        int actualVal = player1.totalCardValue();
//
//
//
//        //verify
//        assertEquals(3, actualVal);

    }
}