import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Player> players = new ArrayList<>();
        players.add(new ComputerBot());
        players.add(new ComputerBot());
        players.add(new ComputerBot());
        players.add(new ComputerBot());
        Gefangenendilemma gd = new Gefangenendilemma();
        gd.initGame(10,players);
        for(Player p: players){
            System.out.println(p);
        }

    }

}
