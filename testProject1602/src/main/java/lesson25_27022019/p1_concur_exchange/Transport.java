package lesson25_27022019.p1_concur_exchange;

import java.util.concurrent.Exchanger;
import java.util.concurrent.TimeUnit;

public class Transport implements Runnable {

    private String name;
    private Exchanger<Cart> exF;
    private Exchanger<Cart> exB;
    Cart cart;


    public Transport(Cart cart, Exchanger<Cart> exF, Exchanger<Cart> exB) {
        this.name = "Transport";
        this.cart = null;
        this.exF = exF;
        this.exB = exB;
        new Thread(this).start();
    }


    @Override
    public void run() {


        System.out.println(name + " waiting for cart");

        try {
            cart = exF.exchange(null);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(name + " received the cart");

        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(name + " transfered to unloader");


         try {
            cart = exB.exchange(cart);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }




    }
}
