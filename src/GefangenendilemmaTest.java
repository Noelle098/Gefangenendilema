import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GefangenendilemmaTest {

    Gefangenendilemma gdf;
    Player playerTrue;
    Player playerTrue2;
    Player playerFalse;
    Player playerFalse2;

    @BeforeEach
    void setUp() {
        gdf = new Gefangenendilemma();
        playerTrue = new Player() {
            @Override
            public boolean play(Player p) {
                return true;
            }

            @Override
            protected void history(int erg) {

            }
        };
        playerTrue2 = new Player() {
            @Override
            public boolean play(Player p) {
                return true;
            }

            @Override
            protected void history(int erg) {

            }
        };
        playerFalse = new Player() {
            @Override
            public boolean play(Player p) {
                return false;
            }

            @Override
            protected void history(int erg) {

            }
        };
        playerFalse2 = new Player() {
            @Override
            public boolean play(Player p) {
                return false;
            }

            @Override
            protected void history(int erg) {

            }
        };
    }


    @org.junit.jupiter.api.Test
    void initGame() {
        gdf.initGame(1, List.of(playerFalse, playerTrue));
        Assertions.assertEquals(3, playerFalse.getBalanceAccount());
        Assertions.assertEquals(-3, playerTrue.getBalanceAccount());
    }

    @org.junit.jupiter.api.Test
    void initGame2() {
        gdf.initGame(1, List.of(playerFalse, playerFalse2));
        Assertions.assertEquals(-2, playerFalse.getBalanceAccount());
        Assertions.assertEquals(-2, playerFalse2.getBalanceAccount());
    }

    @org.junit.jupiter.api.Test
    void initGame3() {
        gdf.initGame(1, List.of(playerTrue, playerTrue2));
        Assertions.assertEquals(1, playerTrue.getBalanceAccount());
        Assertions.assertEquals(1, playerTrue2.getBalanceAccount());
        gdf.initGame(1, List.of(playerTrue, playerTrue2));
        Assertions.assertEquals(2, playerTrue.getBalanceAccount());
        Assertions.assertEquals(2, playerTrue2.getBalanceAccount());
    }

}