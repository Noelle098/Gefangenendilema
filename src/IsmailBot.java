import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class IsmailBot extends Player{

    HashMap<Player,Boolean> lastPlayerReactions;
    public IsmailBot(){
        lastPlayerReactions = new HashMap<Player,Boolean>();
    }
    @Override
    public boolean play(Player p) {
        lastEnemy=p;

        if(lastPlayerReactions.get(p)!=null){
        if(lastPlayerReactions.get(p)){
           return true;
        }
          else return false;
        }

         return true;
    }

    @Override
    protected void history(boolean reaction) {
        lastPlayerReactions.put(lastEnemy,reaction);

    }

}
