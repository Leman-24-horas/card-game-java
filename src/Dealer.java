import java.util.ArrayList;

public class Dealer extends Player {
    private Card hiddenCard;
    
    public Dealer(ArrayList<Card> dealerHand, int dealerSum, int dealerAceCount, Card hiddenCard) {
        super(dealerHand, dealerSum, dealerAceCount);
        this.hiddenCard = hiddenCard;
    }

    public Card getHiddenCard() {
        return hiddenCard;
    }

    public void setHiddenCard(Card hiddenCard) {
        this.hiddenCard = hiddenCard;
    }

}