
/* For GUI */
import java.util.ArrayList;
import java.util.Random;

public class Blackjack {

    /* GLOBAL VARIABLES */
    // a) For deck of cards
    private ArrayList<Card> deck;
    private Random random = new Random();

    /* Repeating code put into a method
     * So that I can call it in GameWindow class
     */
    public Card drawCardFromDeck() {
        return deck.remove(deck.size() - 1);
    }

    // b) Player & dealer entities
    private Player player;
    private Dealer dealer;

    public Player getPlayer() {
        return this.player;
    }

    public Dealer getDealer() {
        return this.dealer;
    }

    // Constructor
    public Blackjack() {
        startGame();
    }

    // 1. Build Deck ---- OKAY
    public void buildDeck() {
        deck = new ArrayList<>();
        String[] values = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A" };
        String[] types = { "C", "D", "H", "S" }; // clubs, diamonds, hearts, spades

        for (String type : types) {
            for (String value : values) {
                Card card = new Card(value, type);
                deck.add(card);
            }
        }

        System.out.println("BUILD DECK: ");
        System.out.println(deck);
    }

    // 2. Shuffle Deck -- OKAY
    public void shuffleDeck() {
        // Logic - swap out any 2 random cards
        int n = deck.size();
        for (int i = 0; i < n / 2; i++) {
            int idx1 = random.nextInt(n);
            int idx2 = random.nextInt(n);

            Card temp = deck.get(idx1);
            deck.set(idx1, deck.get(idx2));
            deck.set(idx2, temp);
        }

        System.out.println("AFTER SHUFFLE");
        System.out.println(deck);
    }

    // 3. Initialize player and dealer
    public void initializeEntities() {
        // a) Dealer initialization
        /*
         * Give dealer a card from the back of the deck
         * Remove that card from the deck
         */
        Card hiddenCard = deck.remove(deck.size() - 1);
        dealer = new Dealer(new ArrayList<Card>(), 0, 0, hiddenCard);

        dealer.addSum(hiddenCard.getValue());
        if (hiddenCard.isAce()) {
            dealer.addAceCount();
        }

        // Dealer not hidden card aka hand
        Card dealerCard = deck.remove(deck.size() - 1);
        dealer.addSum(dealerCard.getValue());
        if (dealerCard.isAce()) {
            dealer.addAceCount();
        }
        dealer.addToHand(dealerCard);

        System.out.println();
        System.out.println("Dealer hand");
        System.out.println("hiddenCard = " + hiddenCard);
        System.out.println("Card = " + dealerCard);
        System.out.println("dealerSum = " + dealer.getSum());
        System.out.println("dealerAceCount = " + dealer.getAceCount());
        System.out.println("dealer hand - " + dealer.getHand());

        // b) Player initialization
        player = new Player(new ArrayList<Card>(), 0, 0);

        // Give player 2 cards
        System.out.println();
        System.out.println("Player hand");

        for (int i = 0; i < 2; i++) {
            Card playerCard = deck.remove(deck.size() - 1);
            player.addSum(playerCard.getValue());
            if (playerCard.isAce()) {
                player.addAceCount();
            }
            player.addToHand(playerCard);
            System.out.println("playerCard = " + playerCard);
        }

        System.out.println("playerSum = " + player.getSum());
        System.out.println("playerAceCount = " + player.getAceCount());
    }

    // 4. Start the game
    public void startGame() {
        /*
         * 1. Create deck of cards
         * 2. Shuffle them
         * 3. Create player & dealer entity and give them 2 cards each
         */

        buildDeck();
        shuffleDeck();
        initializeEntities();
    }

}
