package homework.homework24;

import java.util.concurrent.Semaphore;

public class Unloader implements Runnable {

    private String name;
    private Heap heapTwo;
    private Barrow barrow;
    private Monitor monitor;

    private Semaphore transportSem;
    private Semaphore unloaderSem;

    public Unloader(Heap heapTwo, Barrow barrow, Semaphore transportSem, Semaphore unloaderSem, Monitor monitor) {
        this.name = "Unloader";
        this.heapTwo = heapTwo;
        this.barrow = barrow;
        this.transportSem = transportSem;
        this.unloaderSem = unloaderSem;
        this.monitor = monitor;
        new Thread(this).start();
    }

    @Override
    public void run() {

        while (true) {

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
