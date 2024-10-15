import javax.swing.*;
import java.awt.*;

public class StartingMenu extends JPanel {
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Font stringFont = new Font("Stencil", Font.PLAIN, 100);
        g.setFont(stringFont);
        g.setColor(Color.GRAY);
        g.drawString("Battleship", 470, 200);
    }
}
