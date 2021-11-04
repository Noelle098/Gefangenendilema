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
    protected void history(int erg) {
        Map<Player, Boolean> letzeReaktion = new HashMap<>();



    }

    @Override
    public String toString() {
        return "AlexisBot{" +
                "balanceAccount=" + balanceAccount +
                '}';
    }
}
