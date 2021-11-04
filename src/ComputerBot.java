public class ComputerBot extends Player {


    @Override
    public boolean play(Player p) {
        return Math.random() < 0.5;
    }

    @Override
    protected void history(boolean reaction) {

    }

    @Override
    public String toString() {
        return "ComputerBot{" +
                "balanceAccount=" + balanceAccount +
                '}';
    }
}
