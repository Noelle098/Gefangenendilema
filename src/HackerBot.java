public class HackerBot extends Player{
    boolean sicherung = true;

    @Override
    public boolean play(Player p) {
        if (sicherung) {
            sicherung = false;
            if (p.play(this)) {
                return true;
            }
        }
        return false;
    }

    @Override
    protected void history(boolean reaction) {

    }
}
