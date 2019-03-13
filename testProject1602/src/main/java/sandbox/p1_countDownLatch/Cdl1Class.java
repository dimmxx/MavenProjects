package sandbox.p1_countDownLatch;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class Cdl1Class implements Runnable {

    CountDownLatch cdl1;

    public Cdl1Class(CountDownLatch cdl1) {
        this.cdl1 = cdl1;
        new Thread(this).start();
    }

    @Override
    public void run() {
        for(int i = 0; i < 3; i++){
            System.out.print("- ");
            try {
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            cdl1.countDown();
        }
        System.out.println();

    }
}
