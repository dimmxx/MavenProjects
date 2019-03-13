package sandbox.p2_exchanger;

import java.util.concurrent.Exchanger;

public class User implements Runnable {

    Exchanger<Item> exc;
    Item item;

    public User(Exchanger<Item> exc, Item item) {
        this.exc = exc;
        this.item = item;
        new Thread(this).start();
    }

    @Override
    public void run() {
        System.out.println("User: " + item.toString());
        try {
            item = exc.exchange(item);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("User: " + item.toString());

    }
}
