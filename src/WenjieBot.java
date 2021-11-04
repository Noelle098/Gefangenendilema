import java.util.*;

public class WenjieBot extends Player {
    Map<Player, List<Boolean>> memory = new HashMap();
    Player player = null;

    @Override
    public boolean play(Player p) {
        this.player = p;
        if (memory.get(p) != null) {
            return moral(p);
        }
        return true;
    }

    private boolean moral(Player p) {
        List<Boolean> booleanList = memory.get(p);
        Integer integerSum = booleanList.stream()
                .map(aBoolean -> aBoolean ? 1 : -3)
                .reduce(0, (a, b) -> a + b);
        return integerSum >= 0;
    }

    @Override
    protected void history(boolean reaction) {
        if (memory.get(player) == null) {
            List<Boolean> booleanList = new ArrayList<>();
            booleanList.add(reaction);
            memory.put(player, booleanList);
        } else {
            List<Boolean> booleanList = memory.get(player);
            booleanList.add(reaction);
            memory.replace(player, booleanList);
        }
    }

    @Override
    public String toString() {
        return "WenjieBot{" +
                "balanceAccount=" + balanceAccount +
                ", lastEnemy=" + lastEnemy +
                ", memory=" + memory +
                ", player=" + player +
                '}';
    }
}
