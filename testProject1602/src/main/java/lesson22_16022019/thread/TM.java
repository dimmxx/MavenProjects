package lesson22_16022019.man.thread;

public class TM {



    public static void main(String[] args) {


        //Thread thread = new Thread (new MyThread());
        //thread.start();


        new MyThread(Thread.NORM_PRIORITY, "A");
        new MyThread(Thread.MAX_PRIORITY, "B");

        System.out.println(Thread.activeCount());






    }







}
