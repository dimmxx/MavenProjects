package lessons.lesson23_20022019_thread.p1;

public class Worker1 implements Runnable {

    Q q;

    public Worker1(Q q) {
        super();
        this.q = q;
        new Thread(this).start();
    }

    @Override
    public void run() {


        while (true){

            q.x++;
        }

    }
}
