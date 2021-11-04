import java.util.HashMap;
import java.util.Map;

public class AlexisBot extends Player {
    Map<Player, Boolean> Ergebnis = new HashMap<>();

    @Override
    public boolean play(Player p) {
        boolean b = p.play(this);

        if (Ergebnis.containsKey(p)) {
            return Ergebnis.get(p);
        } else {
            Ergebnis.put(p, b);
            return false;
        }
    }

    @Override
    public String toString() {
        return "AlexisBot{" +
                "balanceAccount=" + balanceAccount +
                '}';
    }

    @Override
    protected void history(boolean reaction) {
    }
}
