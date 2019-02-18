package mate.academy.p4_create_thread3;

public class Main {


    public static void main(String[] args) {

        Thread newThread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Aux thread starts");
            }
        });

        newThread.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main thread stops");


    }






}
