public abstract class Player {
    int balanceAccount;
    Player lastEnemy;

    public abstract boolean play(Player p);

    public void result(int i, Player p) {
        balanceAccount += i;
        lastEnemy = p;
        history(i);
    }

    // Nachbearbeitung für nächstes Mal spielen
    protected abstract void history(int erg);
}
