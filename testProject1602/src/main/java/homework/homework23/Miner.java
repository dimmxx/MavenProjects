package homework.homework23;

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
        while (gold.quantity > 0) {
            gold.mineGold();
            bag += 3;
            System.out.println("Miner " + name + ", Bag: " + bag + ", Gold left: " + gold.quantity);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
