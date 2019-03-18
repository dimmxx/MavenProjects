package lessons.lesson24.p6;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.TimeUnit;

public class Man implements Runnable{

    private String name;
    private CyclicBarrier clb;

    public Man(String name, CyclicBarrier clb) {
        this.name = name;
        this.clb = clb;
        new Thread(this).start();
    }


    @Override
    public void run() {

        try {
            TimeUnit.SECONDS.sleep((int)(Math.random()*5));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(name);


        try {
            clb.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (BrokenBarrierException e) {
            e.printStackTrace();
        }


    }
}
