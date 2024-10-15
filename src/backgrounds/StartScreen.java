package backgrounds;

import javax.swing.*;
import java.awt.*;

public class StartScreen extends JPanel
{
    Image image = new ImageIcon("../images/StartWallpaper.png").getImage();  // Load the image

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        int width = getWidth();
        int height = getHeight();

        // Draw the image scaled to fit the entire panel
        g.drawImage(image, 0, 0, width, height, this);

        // Optionally draw other game elements
        Font stringFont = new Font("Stencil", Font.PLAIN, 25);
        g.setFont(stringFont);
        g.setColor(Color.BLACK);

    }

}
