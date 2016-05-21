package tk.avabin;

/**
 * Main class
 */
class Main {

    private Main() {
        Coin coin = new Coin();
        System.out.println("You throw the coin... And the side is "+ coin.nextThrow().getSideName() + "!");

    }

    public static void main(String[] args) {
        new Main();
    }
}
