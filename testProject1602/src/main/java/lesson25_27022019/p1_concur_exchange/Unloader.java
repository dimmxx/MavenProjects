package lesson25_27022019.p1_concur_exchange;

import java.util.concurrent.Exchanger;

public class Unloader implements Runnable {

    private String name;
     private Exchanger<Cart> exB;
      Cart cart;


    public Unloader(Cart cart, Exchanger<Cart> exB) {
        this.name = "Unloader";
        this.cart = null;
        this.exB = exB;
        new Thread(this).start();
    }

    @Override
    public void run() {

        System.out.println(name + " waiting for cart");

        try {
            cart = exB.exchange(null);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(name + " received the cart");



    }
}
