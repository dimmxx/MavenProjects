package sandbox.p2_exchanger;

import java.util.concurrent.Exchanger;

public class Producer implements Runnable{

    Exchanger<Item> exc;
    Item item;

    public Producer(Exchanger<Item> exc, Item item) {
        this.exc = exc;
        this.item = item;
        new Thread(this).start();
    }

    @Override
    public void run() {
        System.out.println("Producer: " + item.toString());
        try {
            item = exc.exchange(item);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Producer: " + item.toString());


    }
}
