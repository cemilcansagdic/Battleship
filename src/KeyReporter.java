import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyReporter implements KeyListener {
     Battleship battleship;



    public KeyReporter(Battleship battleship) {
        this.battleship = battleship;
    }

    @Override
    public void keyPressed(KeyEvent evt) {
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            System.exit(0);  // Exit when Escape is pressed
        } else if (evt.getKeyCode() == KeyEvent.VK_F) {
            battleship.toggleFullscreen();  // Toggle fullscreen on "F" press
        }
    }

    @Override
    public void keyReleased(KeyEvent evt) {
        // Not used, but required by the interface
    }

    @Override
    public void keyTyped(KeyEvent evt) {
        // Not used, but required by the interface
    }
}
