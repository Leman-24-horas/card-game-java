import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class GamePanel extends JPanel {
    private final Blackjack game;
    
    private int cardHeight = 154;
    private int cardWidth = 110;

    private GameWindow gameWindow;

    public GamePanel(Blackjack game) {
        this.game = game;
    }

    public void setWindow(GameWindow gameWindow) {
        this.gameWindow = gameWindow;
    }

    // Drawing on the game panel
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // some local variables to be used below
        ArrayList<Card> dealerHand = game.getDealer().getHand();
        ArrayList<Card> playerHand = game.getPlayer().getHand();

        System.out.println("GAME PANEL");
        System.out.println(dealerHand);
        System.out.println(playerHand);


        try {
            // draw hidden card
            Image hiddenCardImage = new ImageIcon(getClass().getResource("./cards/BACK.png")).getImage();

            Card dealerHiddenCard = game.getDealer().getHiddenCard();
            if (gameWindow.getStayButton().isEnabled() == false) {
                hiddenCardImage = new ImageIcon(getClass().getResource("./cards/" + dealerHiddenCard.toString() + ".png")).getImage();
            }

            g.drawImage(hiddenCardImage, 20, 20, cardWidth, cardHeight, null); // 0,0 is top left, 20,20 is to right and down

            // draw dealer's hand
            for (int i = 0; i < dealerHand.size(); i++) {
                Card card = dealerHand.get(i);
                Image cardImage = new ImageIcon(getClass().getResource("./cards/" + card.toString() + ".png")).getImage();
                g.drawImage(cardImage, cardWidth + 25 + (cardWidth + 5) * i, 20, cardWidth, cardHeight, null);
            }

            // draw player's hand
            for (int i = 0; i < playerHand.size(); i++) {
                Card playerCard = playerHand.get(i);
                Image cardImage = new ImageIcon(getClass().getResource("./cards/" + playerCard.toString() + ".png")).getImage();
                g.drawImage(cardImage, 20 + (cardWidth + 5) * i, 300, cardWidth, cardHeight, null);
            }

            if (gameWindow.getStayButton().isEnabled() == false) {
                int finalDealerSum = game.getDealer().reduceAce();
                int finalPlayerSum = game.getPlayer().reduceAce();

                System.out.println("STAY:");
                System.out.println("Final dealerSum = " + finalDealerSum);
                System.out.println("Final playerSum = " + finalPlayerSum);

                String message = "";
                if (finalPlayerSum > 21) {
                    message = "You Lose!";
                } else if (finalDealerSum > 21) {
                    message = "You Win!";
                } else if (finalPlayerSum == finalDealerSum) {
                    message = "Oops! It's a Tie";
                } else if (finalPlayerSum > finalDealerSum) {
                    message = "You Win!";
                } else if (finalPlayerSum < finalDealerSum) {
                    message = "You Lose!";
                }

                g.setFont(new Font("Arial", Font.PLAIN, 30));
                g.setColor(Color.white);
                g.drawString(message, 220, 250);
            }

        } catch(Exception e) {
            e.printStackTrace();
        }
    };


}


