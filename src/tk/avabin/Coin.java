package tk.avabin;

import java.util.Random;

/**
 * Implementation of Coin object. now you can throw it!
 */
class Coin {
    private final Random random = new Random();
    private final CoinSide[] sides = {
            new CoinHead(),
            new CoinTail()};

    public CoinSide nextThrow() {
        return sides[random.nextInt(2)];
    }
}
