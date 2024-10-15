import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ClickReporter implements ActionListener {
    Battleship battleship;

    public ClickReporter(Battleship battleship) {
        this.battleship = battleship;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("New Game")) {
            System.out.println("The New Game button was clicked");
            battleship.showGameScreen();
        } else if (e.getActionCommand().equals("Exit Game")) {
            System.exit(0);
        }
    }
}
