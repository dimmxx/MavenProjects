package homework.homework24;

import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class Loader implements Runnable {

    private String name;
    private Heap1 heap1;
    private Barrow barrow;

    private Semaphore loaderSem;
    private Semaphore transportSem;
    private Semaphore unloaderSem;

    public Loader(Heap1 heap1, Barrow barrow, Semaphore loaderSem, Semaphore transportSem, Semaphore unloaderSem) {
        this.name = "Loader";
        this.heap1 = heap1;
        this.barrow = barrow;
        this.loaderSem = loaderSem;
        this.transportSem = transportSem;
        this.unloaderSem = unloaderSem;
        new Thread(this).start();
    }

    @Override
    public void run() {

        while (heap1.getWeight() > 0){

            System.out.println(name + ": comes to loader.acquire");
            try {
                loaderSem.acquire();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(name + ": passed loader.acquire");


            int iter;
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
