package tk.avabin.tests;

import tk.avabin.Coin;
import tk.avabin.CoinSide;

import static junit.framework.TestCase.assertNotNull;
import static junit.framework.TestCase.assertTrue;

/**
 * Test for class Coin
 */
public class CoinTest {

    @org.junit.Test
    public void testNextThrow() throws Exception {
        Coin coin = new Coin();
        assertNotNull(coin);
        CoinSide coinSideThrow = coin.nextThrow();
        assertTrue("Yay, it's working!",
                (coinSideThrow.getSideName().equals("Head") || coinSideThrow.getSideName().equals("Tail")));
    }

}