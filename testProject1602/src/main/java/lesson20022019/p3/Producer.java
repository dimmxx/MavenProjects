package lesson20022019.p3;

public class Producer implements Runnable {

    Store store;

    public Producer(Store store) {
        this.store = store;
        new Thread(this, "Producer").start();
    }

    @Override
    public void run() {


        int i = 0;

        while (true) {


                i++;
                store.put(i);



        }
    }
}
