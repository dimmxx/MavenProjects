package homework.homework23.miners;

public class Miner implements Runnable{

    String name;
    Gold gold;
    int bag = 0;

    public Miner(Gold gold, String name) {
        this.gold = gold;
        this.name = name;
        new Thread(this).start();
    }

    @Override
    public void run() {
        while (gold.getQuantity() > 0) {
            int got = gold.mineGold();
            bag += got;
            System.out.println("Miner " + name + " Gold got: " + got + ", Bag: " + bag + ", Gold left: " + gold.getQuantity());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
