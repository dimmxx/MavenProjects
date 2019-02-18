package mate.academy.p5_create_thread4;

public class Demo {

    public static void main(String[] args) {

        Thread thread = new OtherThread();

        thread.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main thread stops");


    }




}
