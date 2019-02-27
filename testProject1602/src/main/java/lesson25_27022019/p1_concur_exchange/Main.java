package lesson25_27022019.p1_concur_exchange;

import java.util.concurrent.Exchanger;

public class Main {


    public static void main(String[] args) {


        Cart cart = new Cart();
        Exchanger<Cart> exF = new Exchanger<>();
        Exchanger<Cart> exB = new Exchanger<>();



        Loader loader = new Loader(cart, exF);

        Transport transport = new Transport(cart, exF, exB);

        Unloader unloader = new Unloader(cart, exF);





    }



}
