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

    public void auswerten(boolean p1B, boolean p2B, Player p1, Player p2) {
        if (p1B && p2B) {
            p1.result(koopkoop);
            p2.result(koopkoop);
        } else if (p1B) {
            p1.result(-koopkoopN);
            p2.result(koopkoopN);
        } else if (p2B) {
            p1.result(koopkoopN);
            p2.result(-koopkoopN);
        } else {
            p1.result(-koopNkoopN);
            p2.result(-koopNkoopN);
        }
    }
}
