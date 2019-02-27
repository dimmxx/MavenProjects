package lesson25_27022019.p3;

import java.util.concurrent.*;

public class DogMain {


    public static void main(String[] args) {

        ExecutorService es = Executors.newFixedThreadPool(3);

        Future<String> f1;
         Future<String> f2;
         Future<String> f3;

         f1 = es.submit(new Dog("Scratch"));
        f2 = es.submit(new Dog("Seat"));
        f3 = es.submit(new Dog("Sleep"));

        try {
            System.out.println(f1.get());
            System.out.println(f2.get());
            System.out.println(f3.get());


        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        es.shutdown();


    }





}
