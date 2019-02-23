package lesson24.p1;

public class Worker implements Runnable {

    boolean suspend = false;

    public Worker() {
        new Thread(this).start();
    }

    public void suspend() {
        suspend = true;
    }

    public synchronized void resume() {
        suspend = false;
        notify();
    }

    @Override
    public void run() {

        for (int i = 0; i < Integer.MAX_VALUE; i++) {

            synchronized (this) {

                if (suspend) {

                    try {
                        System.out.println("Sleeping");
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }

            System.out.println("I " + i);
        }
    }
}
