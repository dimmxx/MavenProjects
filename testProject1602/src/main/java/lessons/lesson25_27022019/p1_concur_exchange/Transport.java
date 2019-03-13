package lessons.lesson25_27022019.p1_concur_exchange;

import java.util.concurrent.Exchanger;
import java.util.concurrent.TimeUnit;

public class Transport implements Runnable {

    private String name;
    private Exchanger<Cart> exF;
    private Exchanger<Cart> exB;
    private Cart cart;
    private String way;
    private Thread thread;

    public Transport(Cart cart, Exchanger<Cart> exF, Exchanger<Cart> exB) {
        this.name = "Transport";
        this.cart = null;
        this.exF = exF;
        this.exB = exB;
        thread = new Thread(this);
        thread.setDaemon(true);
        thread.start();
    }

    @Override
    public void run() {
        System.out.println(name + ": starting...");
        System.out.println(name + ": The cart " + cart);

        while (true) {

            System.out.println(name + ": (pre Exchanger1 exF(null)) Waiting to get the cart from the loader. Cart: " + cart);

            try {
                cart = exF.exchange(null);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(name + ": (post Exchanger1 exF(cart)) Got the cart from the loader. Cart: " + cart);

            transport();

            System.out.println(name + ": (pre Exchanger2 exB(cart)) Waiting to give the cart to the unloader. Cart: " + cart);

            try {
                cart = exB.exchange(cart);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(name + ": (post Exchanger2 exB(null)) Passed the cart to the unloader. Cart: " + cart);

            System.out.println(name + ": (pre Exchanger3 exB(null)) Waiting to get the cart from the unloader. Cart: " + cart);

            try {
                cart = exB.exchange(null);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(name + ": (post Exchanger3 exB(cart)) Got the cart from the unloader. Cart: " + cart);

            transportBack();

            System.out.println(name + ": (pre Exchanger4 exF(cart)) Waiting to give the cart to the loader. Cart: " + cart);

            try {
                cart = exF.exchange(cart);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(name + ": (post Exchanger4 exF(null)) Passed the cart to the loader. Cart: " + cart);
        }
    }

    public void transport() {

        System.out.println(name + ": Starting transportation ...");
        System.out.print(">>> ");
        for (int i = 0; i < cart.getSpeed(); i++) {
            System.out.print(".. ");
            way += ".. ";
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("\r " + name + ": Transportation is finished ...");

    }

    public void transportBack() {

        System.out.println(name + ": Starting transportation ...");
        System.out.print("<<< ");
        for (int i = 0; i < cart.getSpeed(); i++) {
            System.out.print(".. ");
            way += ".. ";
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("\r " + name + ": Transportation is finished ...");


    }


}
