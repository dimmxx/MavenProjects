package lessons.lesson24.p3_concur;

public class Worker implements Runnable {

    String name;
    Object obj;

    public Worker(String name, Object obj) {
        this.name = name;
        new Thread(this).start();
    }

    @Override
    public void run() {
        System.out.println("Start " + name);

        synchronized (obj) {


            if (!Share.free) {

                try {
                    System.out.println(name + " Sleeping");
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            Share.free = false;

            for (int i = 0; i < 5; i++) {
                Share.count++;
                System.out.println(name + " : " + Share.count);

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }


            Share.free = true;
            notify();
        }

        System.out.println("Released " + name);

    }
}
