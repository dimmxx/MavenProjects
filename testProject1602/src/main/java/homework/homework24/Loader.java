package homework.homework24;

import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class Loader implements Runnable {

    private String name;
    private Heap1 heap1;
    private Barrow barrow;

    private Semaphore loader;
    private Semaphore transport;
    private Semaphore unloader;

    public Loader(Heap1 heap1, Barrow barrow, Semaphore loader, Semaphore transport, Semaphore unloader) {
        this.name = "Loader";
        this.heap1 = heap1;
        this.barrow = barrow;
        this.loader = loader;
        this.transport = transport;
        this.unloader = unloader;
        new Thread(this).start();
    }




    @Override
    public void run() {

        while (heap1.getWeight() > 0){

            int iter = 0;
            if(heap1.getWeight() >= heap1.getShovel()){
                iter = barrow.getCapacity()/heap1.getShovel();
            } else iter = 1;

            for(int i = 0; i < iter; i++){

                barrow.loadBarrow(heap1.takeCoal());

                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }
    }






}
