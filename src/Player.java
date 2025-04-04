import java.util.ArrayList;

public class Player {
    ArrayList<Card> hand;
    private int sum;
    private int aceCount; // Ace is 11 and later changed to 1
    
    public Player(ArrayList<Card> hand, int sum, int aceCount) {
        this.hand = hand;
        this.sum = sum;
        this.aceCount = aceCount;
    }

    public ArrayList<Card> getHand() {
        return hand;
    }

    public void setHand(ArrayList<Card> hand) {
        this.hand = hand;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public int getAceCount() {
        return aceCount;
    }

    public void setAceCount(int aceCount) {
        this.aceCount = aceCount;
    }

    // Methods I'm actually using
    public void addSum(int newAmount) {
        sum += newAmount;
    }

    public void addAceCount() {
        aceCount += 1;
    }

    public void addToHand(Card card) {
        hand.add(card);
    }

    public int reduceAce() {
        while(sum > 21 && aceCount > 0) {
            sum -= 10;
            aceCount--;
        }

        return sum;
    }

}