package homework.homework24;

import java.util.concurrent.Semaphore;

public class Unloader implements Runnable {

    private String name;
    private Heap heapTwo;
    private Barrow barrow;

    private Semaphore loaderSem;
    private Semaphore transportSem;
    private Semaphore unloaderSem;

    public Unloader(Heap heapTwo, Barrow barrow, Semaphore loaderSem, Semaphore transportSem, Semaphore unloaderSem) {
        this.name = "Unloader";
        this.heapTwo = heapTwo;
        this.barrow = barrow;
        this.loaderSem = loaderSem;
        this.transportSem = transportSem;
        this.unloaderSem = unloaderSem;
        new Thread(this).start();
    }

    @Override
    public void run() {

        while (true){

            System.out.println("\n" + ">>>>>>>>" + name + ": comes to " + name + " acquire");
            try {
                unloaderSem.acquire();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("\n" + ">>>>>>>>" + name + ": passed " + name + " acquire");


            heapTwo.getCoal(barrow.unloadBarrow());

            transportSem.release();








        }





    }
}
