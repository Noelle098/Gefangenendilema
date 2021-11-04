import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<String, Integer> result = new HashMap<>();

        int rounds = 10_000;
        for (int i = 0; i<rounds; i++) {
            List<Player> players = new ArrayList<>();
            players.add(new AlexisBot());
            players.add(new FabiusBot());
            players.add(new IsmailBot());
            players.add(new LisaBot());
            players.add(new SaraBot());
            players.add(new WenjieBot());
            Gefangenendilemma gd = new Gefangenendilemma();
            gd.initGame(50, players);
            for(Player p: players){
                if (result.containsKey(p.getClass().getSimpleName())) {
                    Integer temp = result.get(p.getClass().getSimpleName());
                    temp = temp + p.getBalanceAccount();
                    result.replace(p.getClass().getSimpleName(), temp);
                } else {
                    result.put(p.getClass().getSimpleName(), p.getBalanceAccount());
                };
            }
        }

        for ( String player : result.keySet()) {
            System.out.print(player);
            System.out.print(" ");
            System.out.println(result.get(player)/ (double) rounds);
        }


    }

}
