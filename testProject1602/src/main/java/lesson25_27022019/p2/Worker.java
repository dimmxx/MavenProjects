package lesson25_27022019.p2;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class Worker implements Runnable{

    private String name;
    private CountDownLatch cdl;

    public Worker(String name, CountDownLatch cdl) {
        this.name = name;
        this.cdl = cdl;
    }


    @Override
    public void run() {

        for (int i = 0; i < 5; i++){

            System.out.println(name + " " + i);

            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            cdl.countDown();

        }
    }
}
