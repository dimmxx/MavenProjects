package lesson24.p5;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class Latcher implements Runnable{

    CountDownLatch cdl;

    public Latcher(CountDownLatch cdl) {
        this.cdl = cdl;
        new Thread(this).start();
    }

    @Override
    public void run() {

        for (int i= 0; i < 5; i++){

            System.out.println("i " + i);
            cdl.countDown();
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
