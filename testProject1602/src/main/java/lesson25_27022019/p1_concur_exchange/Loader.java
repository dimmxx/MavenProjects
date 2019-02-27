package lesson25_27022019.p1_concur_exchange;

import java.util.concurrent.Exchanger;
import java.util.concurrent.TimeUnit;

public class Loader implements Runnable{

    private String name;
     private Exchanger<Cart> exF;
     Cart cart;


    public Loader(Cart cart, Exchanger<Cart> exF) {
        this.name = "Loader";
        this.cart = cart;
        this.exF = exF;

        new Thread (this).start();
    }

    @Override
    public void run() {


        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(name + " transfered to transporter");


        try {
            cart = exF.exchange(cart);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
