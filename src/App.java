public class App {
    public static void main(String[] args) {
        Blackjack game = new Blackjack();
        GamePanel gamePanel = new GamePanel(game);
        GameWindow gameWindow = new GameWindow(gamePanel, game);
        gamePanel.setWindow(gameWindow);
    }

}