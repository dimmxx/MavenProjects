package homework.homework24;

import java.util.concurrent.Semaphore;

public class Transport implements Runnable {

    private String name;
    private Barrow barrow;
    private Monitor monitor;


    private Semaphore loaderSem;
    private Semaphore transportSem;
    private Semaphore unloaderSem;

    public Transport(Barrow barrow, Semaphore loaderSem, Semaphore transportSem, Semaphore unloaderSem, Monitor monitor) {
        this.name = "Transport";
        this.barrow = barrow;
        this.loaderSem = loaderSem;
        this.transportSem = transportSem;
        this.unloaderSem = unloaderSem;
        this.monitor = monitor;
        new Thread(this).start();
    }

    @Override
    public void run() {

        System.out.println(">>>>>>>>" + name + ": comes to " + name + " acquire");

        while (true) {
            try {
                transportSem.acquire();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(">>>>>>>>" + name + ": passed " + name + " acquire");

            barrow.goBarrow();

            if(barrow.getQuantity() != 0){
                unloaderSem.release();
            }else loaderSem.release();
        }




    }
}
