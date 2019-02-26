package homework.homework24;

import java.util.concurrent.Semaphore;

public class Main {

    public static void main(String[] args) {

        Heap heapOne = new Heap("HeapOne", 10, 3);
        Heap heapTwo = new Heap("HeapTwo", 0, 3);

        Barrow barrow = new Barrow();

        Semaphore loaderSem = new Semaphore(1);
        Semaphore transportSem = new Semaphore(0);
        Semaphore unloaderSem = new Semaphore(0);

        Loader loader = new Loader(heapOne, barrow, loaderSem, transportSem, unloaderSem );



        Transport transport = new Transport(barrow, loaderSem, transportSem, unloaderSem);

        Unloader unloader = new Unloader(heapTwo, barrow, loaderSem, transportSem, unloaderSem);





        





    }



}
