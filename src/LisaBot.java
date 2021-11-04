import java.util.ArrayList;
import java.util.HashMap;

public class LisaBot extends  Player {

    Player currentPlayer;
    HashMap<Player, ArrayList<Boolean>> players = new HashMap<Player, ArrayList<Boolean>>();
    int currentRound;


    @Override
    public boolean play(Player p) {
        if(players.size() == 0){currentRound = 0;}
        if(currentRound > 7 && currentRound < 11){
            return false;
        }
        if(currentRound > 19 && currentRound <26){
            return false;
        }
        if(currentRound > 42 && currentRound <51){
            return false;
        }
        if(players.containsKey(p)){
            currentPlayer = p;
            currentRound++;

            return historyCheck(p);
        }
        players.put(p,new ArrayList<Boolean>());
        currentRound++;
        return Math.random() < 0.5;
    }

    @Override
    protected void history(boolean reaction) {
        if(players.containsKey(currentPlayer)){
            players.get(currentPlayer).add(reaction);
        }else{
            players.put(currentPlayer, new ArrayList<Boolean>());
            players.get(currentPlayer).add(reaction);
            currentRound++;
        }
    }

    private boolean historyCheck (Player p) {
        int n = 0;
        int m = 0;

        for (Boolean b : players.get(p)) {
            if (b) {
                n++;
            } else {
                m++;
            }
        }
        if(n > m){
            return true;
        }else{
            return false;
        }
    }
}
