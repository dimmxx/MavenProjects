package mate.academy.p2_create_thread1;

public class Demo {


    public static void main(String[] args) {

        Runnable smthRun = new SmthRunable();

        Thread anotherThread = new Thread(smthRun);

        anotherThread.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main thread finished");




    }


}
