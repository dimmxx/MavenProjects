package homework.homework24;

import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class Barrow {

    private String name;
    private int capacity;
    private int quantity;
    private int speed;

    Semaphore transport = new Semaphore(0);
    Semaphore loader = new Semaphore(1);
    Semaphore unloader = new Semaphore(0);

    public Barrow() {
        this.name = "Barrow";
        this.capacity = 6;
        this.speed = 5;
    }

    public int getCapacity() {
        return capacity;
    }


    public int getQuantity() {
        return quantity;
    }

    public void loadBarrow(int quantity) {
        this.quantity += quantity;
        System.out.println("\n" + name + ": Loaded " + quantity);
        System.out.println(name + ": Has " + this.quantity);
    }

    public int unloadBarrow() {
        int swap = this.quantity;
        System.out.println("\n" + name + ": Unloaded " + this.quantity);
        this.quantity = 0;
        System.out.println(name + ": Has " + this.quantity);
        return swap;
    }

    public void goBarrow()  {

        System.out.println(name + ": Has " + this.quantity);
        System.out.println(name + ": starts moving ...");

        for (int i = 0; i < speed; i++){

            System.out.print("- ");
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("\n" + name + ": stops moving ...");


    }

}
