import java.util.ArrayList;
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
        if (players.size() % 2 == 0) {
            gameEven(round, players);
        }
        else {
            players.add(new ComputerBot());
            gameEven(round, players);
        }
    }

    private void gameEven(int round, List<Player> players) {
        Random r = new Random();
        while(round > 0){
            List<Player> playersNochZUSpielen = players;
            while (playersNochZUSpielen.size() > 0) {
                Player p1 = playersNochZUSpielen.get(r.nextInt(playersNochZUSpielen.size()));
                playersNochZUSpielen.remove(p1);
                Player p2 = playersNochZUSpielen.get(r.nextInt(playersNochZUSpielen.size()));
                playersNochZUSpielen.remove(p2);
                fight(p1, p2);
            }
            round--;
        }
    }

    private void fight(Player p1, Player p2) {
        boolean p1B = p1.play(p2);
        boolean p2B = p2.play(p1);

        gewinnmatrix.auswerten(p1B, p2B, p1, p2);
    }
}
