public class Gewinnmatrix {
    int koopkoop;
    int koopkoopN;
    int koopNkoopN;

    /* ToDo: hier fehlt noch etwas, weil es sein kann, dass der Betrag um den ein Konto eines Spielers erhöht wird,
         nicht automatisch zu einer Reduktion desselben Betrages auf dem Konto eines anderen Spieler führt */

    Gewinnmatrix() {
        koopkoop = 1;
        koopkoopN = 3;
        koopNkoopN = 2;
    }

    public Gewinnmatrix(int koopkoop, int koopkoopN, int koopNkoopN) {
        this.koopkoop = koopkoop;
        this.koopkoopN = koopkoopN;
        this.koopNkoopN = koopNkoopN;
    }
}
