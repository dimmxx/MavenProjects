package lesson22_16022019_thread.man.man1;

public class ManClass extends Thread {

     String name;
    volatile boolean win;


    public ManClass(String name) {
        this.name = name;
        start();
    }

    @Override
    public void run() {

        String way = "";

        do {

            int steps = (int)(Math.random()*4);
            for(int i = 0; i < steps; i++) {
                way += "_ ";
            }
            System.out.println(name + " : " + way);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }while (way.length() < 20);

        win =true;


    }
}