package lessons.lesson24.p5;

import java.util.concurrent.CountDownLatch;

public class MainCdl {

    public static void main(String[] args) {


        CountDownLatch cdl = new CountDownLatch(5);
        System.out.println("Start");

        Latcher latcher = new Latcher(cdl);

        try {
            cdl.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("End");


    }


}
