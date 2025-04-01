import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Board {
    private int boardHeight = 600;
    private int boardWidth = 600;

    JFrame frame = new JFrame("Blackjack");
    JPanel gamePanel = new JPanel();

    public Board() {
        frame.setVisible(true);
        frame.setSize(boardWidth, boardHeight);
        frame.setLocationRelativeTo(null); // GUI pops up in the middle of the screen
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        gamePanel.setLayout(new BorderLayout());
        gamePanel.setBackground(new Color(53, 101, 77));
        frame.add(gamePanel); // add panel to frame
    }

    

    
}
