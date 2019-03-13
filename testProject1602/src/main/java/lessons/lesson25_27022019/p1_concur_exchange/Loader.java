package lessons.lesson25_27022019.p1_concur_exchange;

import java.util.concurrent.Exchanger;
import java.util.concurrent.TimeUnit;

public class Loader implements Runnable {

    private String name;
    private Exchanger<Cart> exF;
    private Cart cart;
    private int shovel;
    private Heap heap;

    public Loader(Heap heap, Cart cart, Exchanger<Cart> exF) {
        this.heap = heap;
        this.name = "Loader";
        this.shovel = 3;
        this.cart = cart;
        this.exF = exF;
        new Thread(this).start();
    }

    @Override
    public void run() {
        System.out.println(name + ": starting...");
        System.out.println(name + ": The cart: " + cart);
        while (heap.getQuantity() > 0) {

            System.out.println(name + ": Loading started ...");

            loadCart();

            try {
                System.out.println(name + ": (pre Exchanger1 exF(cart)) Waiting to give the cart to the transporter. Cart: " + cart);

                cart = exF.exchange(cart);

                System.out.println(name + ": (post Exchanger1 exF(null)) Passed the cart to the transporter. Cart: " + cart);

                System.out.println(name + ": (pre Exchanger2 exF(null)) Waiting to get the cart from the transporter. Cart: " + cart);

                cart = exF.exchange(null);

                System.out.println(name + ": : (post Exchanger2 exF(cart)) Got the cart from the transporter. Cart: " + cart);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(name + ": The work is finished. Shutting down");
    }

    public void loadCart() {
        while (cart.getCapacity() < cart.getMaxCapacity()) {
            cart.setCapacity(cart.getCapacity() + takeFromHeap(shovel));
            System.out.println(name + ": The cart has " + cart.getCapacity());
            if (cart.getCapacity() > cart.getMaxCapacity()) {
                int overload = cart.getCapacity() - cart.getMaxCapacity();
                heap.setQuantity(heap.getQuantity() + overload);
                cart.setCapacity(cart.getCapacity() - overload);
                System.out.println(name + ": The cart has " + cart.getCapacity());
            }
            try {
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (heap.getQuantity() == 0) break;
        }
        System.out.println(name + ": The cart is loaded. The cart has " + cart.getCapacity());
        System.out.println(name + ": " + heap.getName() + " has " + heap.getQuantity());
    }

    public int takeFromHeap(int shovel) {
        System.out.println(name + ": " + heap.getName() + " has " + heap.getQuantity());
        System.out.print(this.name + ": Taking from heap1 ");
        if (heap.getQuantity() >= shovel) {
            heap.setQuantity(heap.getQuantity() - shovel);
            System.out.println(shovel);
            return shovel;
        } else {
            int swap = heap.getQuantity();
            heap.setQuantity(0);
            System.out.println(swap);
            return swap;
        }
    }
}
