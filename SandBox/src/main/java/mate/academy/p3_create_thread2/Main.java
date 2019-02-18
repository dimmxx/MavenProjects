package mate.academy.p3_create_thread2;

public class Main {

    public static void main(String[] args) {


        Thread newThread = new Thread(() -> System.out.println("Aux thread starts"));

        newThread.start();


        try {
            Thread.sleep(1000);
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("Main thread stops");




    }


}
