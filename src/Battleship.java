import backgrounds.GameScreen;
import backgrounds.StartScreen;

import javax.swing.*;
import java.awt.*;

public class Battleship {
    JFrame frame;
    StartingMenu startingMenu;
    GameScreen gameScreen;
    StartScreen startScreen;
    ClickReporter clickReporter;
    KeyReporter keyReporter;
    JPanel mainPanel;
    CardLayout cardLayout;
    boolean isFullscreen = true;

    void buildGUI() {
        SwingUtilities.invokeLater(() -> {
            frame = new JFrame("Battleship");
            cardLayout = new CardLayout();
            mainPanel = new JPanel(cardLayout);  // Main panel with CardLayout

            startScreen = new StartScreen();
            startingMenu = new StartingMenu();
            gameScreen = new GameScreen();

            JButton button1 = new JButton("New Game");
            JButton button2 = new JButton("Exit Game");

            button1.setBounds(710, 500, 120, 50);
            button2.setBounds(710, 600, 120, 50);

            Color blue = new Color(0, 0, 255);
            startingMenu.setBackground(blue);
            startingMenu.setLayout(null);  // Use null layout to manually position buttons
            startingMenu.add(button1);
            startingMenu.add(button2);

            clickReporter = new ClickReporter(this);
            button1.addActionListener(clickReporter);
            button2.addActionListener(clickReporter);

            keyReporter = new KeyReporter(this);
            frame.addKeyListener(keyReporter);  // Attach the KeyListener to the JFrame

            mainPanel.add(startingMenu, "StartingMenu");
            mainPanel.add(gameScreen, "backgrounds.GameScreen");

            frame.add(mainPanel);
            frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
            frame.setUndecorated(true);  // Start in fullscreen mode
            frame.setVisible(true);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setFocusable(true);

            // Make sure the frame is focused to capture key events
            frame.requestFocusInWindow();
        });
    }

    // Method to toggle between fullscreen and windowed mode
    void toggleFullscreen() {
        frame.dispose();

        if (isFullscreen) {
            frame.setUndecorated(false);
            frame.setExtendedState(JFrame.NORMAL);
            frame.setSize(800, 600);
            frame.setLocationRelativeTo(null);
        } else {
            frame.setUndecorated(true);
            frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        }

        isFullscreen = !isFullscreen;
        frame.setVisible(true);
    }

    // Method to switch to the game screen
    void showGameScreen() {
        cardLayout.show(mainPanel, "backgrounds.GameScreen");
    }

    void showStartScreen(){

    }

    public static void main(String[] args) {
        new Battleship().buildGUI();
    }
}
