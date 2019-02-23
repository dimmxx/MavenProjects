package lesson24.p6;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class Main {

    public static void main(String[] args) {

        Bus bus = new Bus();

        //CyclicBarrier clb = new CyclicBarrier(5, bus);

        CyclicBarrier clb = new CyclicBarrier(5, ()-> System.out.println("Bus is gone"));



        for (int i = 0; i < 10; i++){
            new Man("man " + i, clb);

        }




    }



}
