/* For GUI */
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.*;;

public class Blackjack {
    private ArrayList<Card> deck;

    // Constructor
    public Blackjack() {
    
    }

    // Methods here
    public void buildDeck() {
        deck = new ArrayList<>();
        String[] values = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        String[] types = {"C", "D", "H", "S"}; // clubs, diamonds, hearts, spades

        for(String type : types) {
            for(String value : values) {
                Card card = new Card(type, value);
                deck.add(card);
            }
        }

        System.out.println("BUILD DECK: ");
        System.out.println(deck);
    }

    public void startGame() {
        /* 1. Create deck of cards
         * 2. Shuffle them
         * 3. Assign 2 cards to deal and player
        */

        buildDeck();
    }

    // public static void main(String[] args) {
    //     buildDeck();
    // }
}

