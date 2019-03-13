package lessons.lesson25_27022019.p1_concur_exchange;

import java.util.concurrent.Exchanger;

public class Main {

    public static void main(String[] args) {

        Heap heap1 = new Heap("Heap1", 10);
        Heap heap2 = new Heap("Heap2", 0);

        Cart cart = new Cart();

        Exchanger<Cart> exF = new Exchanger<>();
        Exchanger<Cart> exB = new Exchanger<>();

        Loader loader = new Loader(heap1, cart, exF);

        Transport transport = new Transport(cart, exF, exB);

        Unloader unloader = new Unloader(heap1, heap2, cart, exB);

        System.out.println("END OF MAIN");





    }



}
