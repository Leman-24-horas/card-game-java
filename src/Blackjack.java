/* For GUI */
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.swing.*;

public class Blackjack {

    // Player's hand
    private ArrayList<Card> deck;
    private Random random = new Random();

    // Dealer's hand
    private Card hiddenCard;
    ArrayList<Card> dealerHand;
    private int dealerSum;
    private int dealerAceCount; // Ace can be 1 or 11

    // Player's hand
    ArrayList<Card> playerHand;
    private int playerSum;
    private int playerAceCount;

    // Constructor
    public Blackjack() {
    
    }

    // Methods here
    // 1. Build Deck
    public void buildDeck() {
        deck = new ArrayList<>();
        String[] values = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        String[] types = {"C", "D", "H", "S"}; // clubs, diamonds, hearts, spades

        for(String type : types) {
            for(String value : values) {
                Card card = new Card(value, type);
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
        shuffleDeck();

        // dealer
        dealerHand = new ArrayList<>();
        dealerSum = 0;
        dealerAceCount = 0;

        // give dealer a card from the back of the deck and remove it from deck
        hiddenCard = deck.remove(deck.size() - 1);
        dealerSum += hiddenCard.getValue();
        dealerAceCount += hiddenCard.isAce() ? 1 : 0;

        // Dealer not hidden card aka hand
        Card card = deck.remove(deck.size() - 1);
        dealerSum += card.getValue();
        dealerAceCount += card.isAce() ? 1 : 0;
        dealerHand.add(card);

        System.out.println();
        System.out.println("Dealer hand");
        System.out.println("hiddenCard = " + hiddenCard);
        System.out.println("Card = " + card);
        System.out.println("dealerSum = " + dealerSum);
        System.out.println("dealerAceCount = " + dealerAceCount);

        // player
        playerHand = new ArrayList<>();
        playerSum = 0;
        playerAceCount = 0;

        // Give player 2 cards
        System.out.println();
        System.out.println("Player hand");

        for(int i = 0; i < 2; i++) {
            Card playerCard = deck.remove(deck.size() - 1);
            playerSum += playerCard.getValue();
            playerAceCount += playerCard.isAce() ? 1 : 0;
            playerHand.add(playerCard);

            System.out.println("playerCard = " + playerCard);

        }

        System.out.println("playerSum = " + playerSum);
        System.out.println("playerAceCount = " + playerAceCount);
    }

    // 2. Shuffle Deck
    public void shuffleDeck() {
        // Logic - swap out any 2 random cards
        int n = deck.size();
        for(int i = 0; i < n/2; i++) {
            int idx1 = random.nextInt(n);
            int idx2 = random.nextInt(n);

            Card temp = deck.get(idx1);
            deck.set(idx1, deck.get(idx2));
            deck.set(idx2, temp);
        }

        System.out.println("AFTER SHUFFLE");
        System.out.println(deck);
    }
}

