import java.util.HashMap;

public class LisaBot extends  Player {

    Player currentPlayer;
    HashMap<Player, Integer> players = new HashMap<Player, Integer>();
    int currentRound;


    @Override
    public boolean play(Player p) {
        if(players.size() == 0){currentRound = 0;}
        if(players.containsKey(p)){
            currentPlayer = p;
            currentRound++;
            return historyCheck(p);
        }
        players.put(p,0);
        currentRound++;
        return Math.random() < 0.8;
    }

    private boolean historyCheck (Player p) {
        if(players.get(p) < 0){
            return false;
        }
        else {
            return true;
        }
    }

    @Override
    protected void history(int erg) {
        if(players.containsKey(currentPlayer)){

        }

    }

    public static void main(String[] args) {

        for(int i = 0; i < 5; i ++){
            boolean bo = Math.random() < 0.8;
            System.out.println(bo);
        }
    }
}
