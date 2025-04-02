// import java.awt.BorderLayout;
// import java.awt.Color;

// import javax.swing.ImageIcon;
// import javax.swing.JButton;
// import javax.swing.JFrame;
// import javax.swing.JPanel;
// import javax.swing.border.Border;

// import java.awt.*;
// import java.awt.event.*;

// public class Board {
//     private int boardWidth = 600;
//     private int boardHeight = 600;

//     private int cardWidth = 110;
//     private int cardHeight = 154;

//     JFrame frame = new JFrame("Blackjack");
//     JPanel gamePanel = new JPanel() {
//         // Drawing on the game panel
//         @Override
//         public void paintComponent(Graphics g) {
//             super.paintComponent(g);

//             try {
//                 // draw hidden card
//                 Image hiddenCardImage = new ImageIcon(getClass().getResource("./cards/BACK.png")).getImage();
//                 g.drawImage(hiddenCardImage, 20, 20, cardWidth, cardHeight, null); // 0,0 is top left, 20,20 is to right and down

//                 // for(int i = 0; i < deal) we don't have size of dealer's hand
//             } catch (Exception e) {
//                 e.printStackTrace();;
//             }
//         }
//     };
    
//     JPanel buttonPanel = new JPanel();
//     JButton hitButton = new JButton("Hit");
//     JButton stayButton = new JButton("Stay");

//     public Board() {
//         frame.setVisible(true);
//         frame.setSize(boardWidth, boardHeight);
//         frame.setLocationRelativeTo(null); // GUI pops up in the middle of the screen
//         frame.setResizable(false);
//         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//         gamePanel.setLayout(new BorderLayout());
//         gamePanel.setBackground(new Color(53, 101, 77));
//         frame.add(gamePanel); // add panel to frame

//         hitButton.setFocusable(false);
//         buttonPanel.add(hitButton);
//         stayButton.setFocusable(false);
//         buttonPanel.add(stayButton);
//         frame.add(buttonPanel, BorderLayout.SOUTH); // add panel to frame
//     }

// }
