package lessons.lesson24.p4;

import java.util.concurrent.Semaphore;

public class Store {

    private int n;

    Semaphore consumer = new Semaphore(0);
    Semaphore producer = new Semaphore(1);

    int get() {
        try {
            consumer.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Get: " + n);
        int swap = n;
        n = 0;
        producer.release();
        return swap;

    }

    void put(int n) {
        try {
            producer.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.n = n;
        System.out.println("Put: " + this.n);
        consumer.release();
    }
}
