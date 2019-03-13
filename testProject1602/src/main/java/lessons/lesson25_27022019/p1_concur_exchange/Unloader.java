package lessons.lesson25_27022019.p1_concur_exchange;

import java.util.concurrent.Exchanger;

public class Unloader implements Runnable {

    private String name;
    private Exchanger<Cart> exB;
    private Cart cart;
    private Heap heap1;
    private Heap heap2;


    public Unloader(Heap heap1, Heap heap2, Cart cart, Exchanger<Cart> exB) {
        this.name = "Unloader";
        this.heap1 = heap1;
        this.heap2 = heap2;
        this.cart = null;
        this.exB = exB;
        new Thread(this).start();
    }

    @Override
    public void run() {
        System.out.println(name + ": starting...");
        System.out.println(name + ": The cart: " + cart);
        while (heap2.getQuantity() != heap1.getStartQuantity()) {
            System.out.println(name + ": (pre Exchanger1 exB(null)) Waiting to get the cart from the transporter. Cart: " + cart);

            try {
                cart = exB.exchange(null);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(name + ": : (post Exchanger1 exB(cart)) Got the cart from the transporter. Cart: " + cart);

            putToHeap();

            System.out.println(name + ": : (pre Exchanger2 exB(cart)) Waiting to give the cart to the transporter. Cart: " + cart);

            try {
                cart = exB.exchange(cart);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(name + ": (post Exchanger2 exB(null)) Passed the cart to the transporter. Cart: " + cart);



        }
        System.out.println(name + ": The work is finished. Shutting down");
    }

    public void putToHeap() {
        System.out.println(name + ": Unloading started ...");
        System.out.println(name + ": The cart has " + cart.getCapacity());
        System.out.println(name + ": " + heap2.getName() + " has " + heap2.getQuantity());

        heap2.setQuantity(heap2.getQuantity() + cart.getCapacity());
        cart.setCapacity(0);

        System.out.println(name + ": Unloading finished ...");
        System.out.println(name + ": The cart has " + cart.getCapacity());
        System.out.println(name + ": " + heap2.getName() + " has " + heap2.getQuantity());



    }

}
