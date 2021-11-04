public class FabiusBot extends Player {

    @Override
    public boolean play(Player p) {
        return false;
    }

    @Override
    protected void history(boolean reaction) {

    }

    @Override
    public String toString() {
        return "FabiusBot{" +
                "balanceAccount=" + balanceAccount +
                '}';
    }
}
