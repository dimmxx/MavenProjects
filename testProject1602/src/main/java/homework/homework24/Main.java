package homework.homework24;

import java.util.concurrent.Semaphore;

public class Main {

    public static void main(String[] args) {


        Monitor monitor = new Monitor();

        Heap heapOne = new Heap("HeapOne", 10, 3, monitor);
        Heap heapTwo = new Heap("HeapTwo", 0, 3, monitor);

        Barrow barrow = new Barrow(monitor);



        Semaphore loaderSem = new Semaphore(1);
        Semaphore transportSem = new Semaphore(0);
        Semaphore unloaderSem = new Semaphore(0);

        Loader loader = new Loader(heapOne, barrow, loaderSem, transportSem, monitor);

        Transport transport = new Transport(barrow, loaderSem, transportSem, unloaderSem, monitor);

        Unloader unloader = new Unloader(heapTwo, barrow, transportSem, unloaderSem, monitor);





        





    }



}
