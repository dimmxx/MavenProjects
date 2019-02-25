package homework.homework24;

import java.util.concurrent.Semaphore;

public class Main {

    public static void main(String[] args) {

        Heap1 heap1 = new Heap1(100, 3);
        Barrow barrow = new Barrow();

        Semaphore loaderSem = new Semaphore(1);
        Semaphore transportSem = new Semaphore(0);
        Semaphore unloaderSem = new Semaphore(0);

        Loader loader = new Loader(heap1, barrow, loaderSem, transportSem, unloaderSem );



        





    }



}
