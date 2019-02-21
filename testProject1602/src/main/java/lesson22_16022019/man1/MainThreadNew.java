package lesson22_16022019.man.man1;

public class MainThreadNew {

    public static void main(String[] args) {
//
//        ThreadNew tn = new ThreadNew();
//        Thread thread = new Thread(tn);
//        thread.start();
////




//        Runnable r = new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Some text");
//            }
//        };
//
//
//        new Thread(r.run());



        new Thread(() -> System.out.println("Some text")).start();


    }



}
