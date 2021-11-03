import java.util.List;
import java.util.Random;

public class Gefangenendilemma {
    int round;
    List<Player> players;
    Gewinnmatrix gewinnmatrix;

    Gefangenendilemma() {
        gewinnmatrix = new Gewinnmatrix();
    }

    Gefangenendilemma(Gewinnmatrix gewinnmatrix) {
        this.gewinnmatrix = gewinnmatrix;
    }

    public void initGame(int round, List<Player> players) {
        // for round
            // fight p, p
        // new Random().nextInt(players.size());
    }

    private void fight(Player p1, Player p2) {
        boolean p1B = p1.play(p2);
        boolean p2B = p2.play(p1);

        // ToDo: weniger Zeilen in einer Methode wären gut. Nur eine Idee: Könnte man das nicht in Gewinnmatrix auslagern?

        if (p1B && p2B) {
            p1.result(gewinnmatrix.koopkoop, p2);
            p2.result(gewinnmatrix.koopkoop, p1);
        } else if (p1B) {
            p1.result(-gewinnmatrix.koopkoopN, p2);
            p2.result(gewinnmatrix.koopkoopN, p1);
        } else if (p2B) {
            p1.result(gewinnmatrix.koopkoopN, p2);
            p2.result(-gewinnmatrix.koopkoopN, p1);
        } else {
            p1.result(-gewinnmatrix.koopNkoopN, p2);
            p2.result(-gewinnmatrix.koopNkoopN, p1);
        }
    }
}
