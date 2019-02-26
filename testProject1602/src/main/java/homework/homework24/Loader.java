package homework.homework24;

import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class Loader implements Runnable {

    private String name;
    private Heap heap;
    private Barrow barrow;

    private Semaphore loaderSem;
    private Semaphore transportSem;
    private Semaphore unloaderSem;

    public Loader(Heap heap, Barrow barrow, Semaphore loaderSem, Semaphore transportSem, Semaphore unloaderSem) {
        this.name = "Loader";
        this.heap = heap;
        this.barrow = barrow;
        this.loaderSem = loaderSem;
        this.transportSem = transportSem;
        this.unloaderSem = unloaderSem;
        new Thread(this).start();
    }

    @Override
    public void run() {

        while (heap.getWeight() > 0){

            System.out.println(">>>>>>>>" + name + ": comes to " + name + " acquire");
            try {
                loaderSem.acquire();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(">>>>>>>>" + name + ": passed " + name + " acquire");

            int iter;
            if(heap.getWeight() >= heap.getShovel()){
                iter = barrow.getCapacity()/ heap.getShovel();
            } else iter = 1;

            for(int i = 0; i < iter; i++){
                barrow.loadBarrow(heap.giveCoal());

                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            transportSem.release();

        }
    }



}
