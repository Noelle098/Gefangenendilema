import java.util.ArrayList;
import java.util.List;

public class SaraBot extends Player{
    List<PlayerBotSpeicher> speicher = new ArrayList<>();
    boolean lastReaction = true;
    int lastIndex;

    @Override
    public boolean play(Player p) {
        boolean nichtInDerListe = true;
        for (PlayerBotSpeicher playerBotSpeicher : speicher) {
            if (playerBotSpeicher.getPlayer() == p) {
                lastReaction = playerBotSpeicher.getNextPlay();
                nichtInDerListe = false;
                lastIndex = speicher.indexOf(playerBotSpeicher);
            }
        }
        if (nichtInDerListe) {
            PlayerBotSpeicher plBs = new PlayerBotSpeicher(p);
            speicher.add(plBs);
            lastIndex = speicher.indexOf(plBs);
        }
        return lastReaction;
    }

    @Override
    protected void history(boolean reaction) {
        speicher.get(lastIndex).setEntscheidung(reaction);

    }

    class PlayerBotSpeicher {
        Player player;
        boolean nextPlay = false;
        Entscheidung entscheidung = Entscheidung.NEGATIV;

        public PlayerBotSpeicher(Player player) {
            this.player = player;
        }

        public Player getPlayer() {
            return player;
        }

        public boolean getNextPlay() {
            return nextPlay;
        }

        public void setEntscheidung(boolean reaction) {
            if (reaction) {
                switch (entscheidung) {
                    case POSITIV:
                        entscheidung = Entscheidung.SEHRPOSITIV;
                        break;
                    case SEHRPOSITIV:
                        nextPlay = true;
                        break;
                    case NEGATIV:
                        entscheidung = Entscheidung.POSITIV;
                        nextPlay = false;
                        break;
                    case SEHRNEGATIV:
                        entscheidung = Entscheidung.NEGATIV;
                        break;
                }
            } else {
                switch (entscheidung) {
                    case POSITIV:
                        entscheidung = Entscheidung.NEGATIV;
                        nextPlay = false;
                        break;
                    case SEHRPOSITIV:
                        entscheidung = Entscheidung.POSITIV;
                        nextPlay = false;
                        break;
                    case NEGATIV:
                        entscheidung = Entscheidung.SEHRNEGATIV;
                        break;
                    case SEHRNEGATIV:
                        break;
                }
            }
        }

        enum Entscheidung {
            POSITIV, SEHRPOSITIV, NEGATIV, SEHRNEGATIV;
        }

    }
}