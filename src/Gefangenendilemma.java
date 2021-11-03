import java.util.List;

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

    }

    private void fight(Player p1, Player p2) {

    }
}
