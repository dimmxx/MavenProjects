package lessons.lesson24.p4;

public class Consumer implements Runnable {

    Store store;

    public Consumer(Store store) {
        this.store = store;
        new Thread(this, "Consumer").start();
    }

    @Override
    public void run() {
        while (true) {
            store.get();
        }

    }
}
