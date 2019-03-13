package lessons.lesson22_16022019_thread.man.thread;

public class MyThread extends Thread {

    String name;

    public MyThread(int priority, String name) {
        this.name = name;
        System.out.println(name + ": Thread started");
        setPriority(priority);
        start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++){
            System.out.println(name + " : " + i);
        }
        //System.out.println("New Thread");
    }



}
