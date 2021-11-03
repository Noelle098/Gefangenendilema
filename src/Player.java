public abstract class Player {
    int balanceAccount = 0;
    Player lastEnemy;

    public int getBalanceAccount() {
        return balanceAccount;
    }

    public abstract boolean play(Player p);

    public void result(int i) {
        balanceAccount += i;
        history(i);
    }

    @Override
    public String toString() {
        return "Player{" +
                "balanceAccount=" + balanceAccount +
                '}';
    }

    // Nachbearbeitung für nächstes Mal spielen
    protected abstract void history(int erg);
}
