public abstract class Player {
    int balanceAccount = 0;
    Player lastEnemy;

    public int getBalanceAccount() {
        return balanceAccount;
    }

    public abstract boolean play(Player p);

    public void result(int i, boolean reaction) {
        balanceAccount += i;
        history(reaction);
    }



    // Nachbearbeitung für nächstes Mal spielen
    protected abstract void history(boolean reaction);
}
