package sandbox.p1_countDownLatch;

import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;

public class CdlClass implements Runnable {

    private CountDownLatch countDownLatch;

    public CdlClass(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
        new Thread(this).start();

    }


    @Override
    public void run() {

        cdl1(3);


        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            countDownLatch.countDown();
        }


    }


    public void cdl1(int num) {
        CountDownLatch cdl1 = new CountDownLatch(num);
        new Cdl1Class(cdl1);
        try {
            cdl1.await();
        } catch (InterruptedException e) {
            e.printStackTrace();


        }
    }

}
