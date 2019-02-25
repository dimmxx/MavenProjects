package homework.homework24;

import java.util.concurrent.Semaphore;

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
        System.out.println("\n" + name + ": loaded " + quantity);
        System.out.println(name + " : has " + this.quantity);




    }


    public void goBarrow(){

    }

}
