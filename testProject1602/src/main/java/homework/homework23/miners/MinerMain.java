package homework.homework23.miners;

public class MinerMain {

    public static void main(String[] args) {

        Gold gold = new Gold(1000);
        Barracks barracks = new Barracks();

        Miner miner1 = new Miner(gold, "John");
        Miner miner2 = new Miner(gold, "Peter");
        Miner miner3 = new Miner(gold, "David");

        while (gold.getQuantity() > 0){
            new Miner (gold, barracks.generateName());
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }










    }





}
