public abstract class Player {
    int blanceAccount;

    public abstract boolean play();

    public void balance(int i) {
        blanceAccount += i;
    }
}
