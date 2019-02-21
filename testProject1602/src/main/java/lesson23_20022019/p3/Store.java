package lesson23_20022019.p3;

public class Store {

    volatile boolean full = false;
    private int n;

    synchronized void get() {
        if (!full) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Get: " + n);
        //int swap = n;
        n = 0;
        full = false;
        notify();
        //return swap;
    }

    synchronized void put(int n) {
        if(full) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.n = n;
        System.out.println("Put: " + this.n);
        full = true;
        notify();
    }




}
