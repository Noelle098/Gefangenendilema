public class Gewinnmatrix {
    int koopKoop1, koopKoopN,koopNkoopN1;
    int koopKoop2, koopNKoop,koopNkoopN2;

    Gewinnmatrix() {
        koopKoop1 = 1;
        koopKoopN = -3;
        koopNkoopN1 = -2;
        koopKoop2 = 1;
        koopNKoop = 3;
        koopNkoopN2 = -2;
    }

    public Gewinnmatrix(int koopKoop1, int koopKoopN, int koopNkoopN1, int koopKoop2, int koopNKoop, int koopNkoopN2) {
        this.koopKoop1 = koopKoop1;
        this.koopKoopN = koopKoopN;
        this.koopNkoopN1 = koopNkoopN1;
        this.koopKoop2 = koopKoop2;
        this.koopNKoop = koopNKoop;
        this.koopNkoopN2 = koopNkoopN2;
    }

    public void auswerten(boolean p1B, boolean p2B, Player p1, Player p2) {
        if (p1B && p2B) {
            p1.result(koopKoop1, p2B);
            p2.result(koopKoop2, p1B);
        } else if (p1B) {
            p1.result(koopKoopN, p2B);
            p2.result(koopNKoop, p1B);
        } else if (p2B) {
            p1.result(koopNKoop, p2B);
            p2.result(koopKoopN, p1B);
        } else {
            p1.result(koopNkoopN1, p2B);
            p2.result(koopNkoopN2, p1B);
        }
    }
}
