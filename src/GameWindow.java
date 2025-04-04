import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class GameWindow {
    private int windowHeight = 600;
    private int windowWidth = 600;

    private JFrame frame = new JFrame("Blackjack");

    private JPanel buttonPanel = new JPanel();
    private JButton hitButton = new JButton("Hit"); // protected so that I can access these in GamePanel
    protected JButton stayButton = new JButton("Stay");

    public GameWindow(GamePanel gamePanel, Blackjack game) { // need to pass in player & dealer
        frame.setVisible(true);
        frame.setSize(windowHeight, windowWidth);
        frame.setLocationRelativeTo(null); // GUI pops up in the middle of the screen
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        gamePanel.setBackground(new Color(53, 101, 77));
        gamePanel.setLayout(new BorderLayout());
        frame.add(gamePanel);

        // adding buttons to the panel
        hitButton.setFocusable(false);
        buttonPanel.add(hitButton);
        stayButton.setFocusable(false);
        buttonPanel.add(stayButton);
        frame.add(buttonPanel, BorderLayout.SOUTH); // add panel to frame

        // action listeners so that GUI can interact with backend code
        hitButton.addActionListener(new ActionListener() {
            // hit button draws a new card when clicked
            public void actionPerformed(ActionEvent e) {
                Card playerCard = game.drawCardFromDeck();
                Player player = game.getPlayer();
                player.addSum(playerCard.getValue());

                if(playerCard.isAce()) {
                    player.addAceCount();
                }

                player.getHand().add(playerCard);

                if(player.reduceAce() > 21) {
                    hitButton.setEnabled(false);
                }

                gamePanel.repaint(); // this calls the paint component overridden above
            }
        });

        stayButton.addActionListener(new ActionListener() {
            // stay means no more cards
            public void actionPerformed(ActionEvent e) {
                // cheack playerSum and dealerSum
                // see who is bigger and declare winner
                hitButton.setEnabled(false);
                stayButton.setEnabled(false);

                // dealer must draw until dealerSum >= 17
                Dealer dealer = game.getDealer();
                while(dealer.getSum() < 17) {
                    Card dealerCard = game.drawCardFromDeck();
                    dealer.addSum(dealerCard.getValue());

                    if(dealerCard.isAce()) {
                        dealer.addAceCount();
                    }

                    dealer.getHand().add(dealerCard);
                }

                gamePanel.repaint();

            }
        });
    }

    public JButton getStayButton() {
        return stayButton;
    }
}
