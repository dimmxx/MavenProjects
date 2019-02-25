package homework.homework24;

import java.util.concurrent.Semaphore;

public class Main {

    public static void main(String[] args) {

        Heap1 heap1 = new Heap1(100, 3);







        Semaphore loader = new Semaphore(1);
        Semaphore transport = new Semaphore(0);
        Semaphore unloader = new Semaphore(0);



        





    }



}
