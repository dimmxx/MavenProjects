package lesson23_20022019.p3;

public class Store {

    volatile boolean notEmpty;
    private int n;


    synchronized int get() {
        if (!notEmpty) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("get " + n);
        int swap = n;
        n = 0;
        notEmpty = false;
        notify();
        return swap;
    }

    synchronized void put(int n) {
        if(notEmpty) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.n = n;
        System.out.println("Put " + this.n);
        notEmpty = true;
        notify();
    }




}
