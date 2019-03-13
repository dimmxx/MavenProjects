package sandbox.p1_countDownLatch;

import java.util.concurrent.CountDownLatch;

public class MainLatcher {

    public static void main(String[] args) {

        System.out.println("START");

        CountDownLatch cdl = new CountDownLatch(10);
        new CdlClass(cdl);

        try {
            cdl.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("END");





    }




}
