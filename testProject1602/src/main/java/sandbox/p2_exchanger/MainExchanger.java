package sandbox.p2_exchanger;

import java.util.concurrent.Exchanger;

public class MainExchanger {

    public static void main(String[] args) {

        Exchanger<Item> exc = new Exchanger<>();

        Item itemProd = new Item("producer", 100);
        Item itemUser = new Item( "user", 50);

        new Producer(exc, itemProd);
        new User(exc, itemUser);





    }



}
