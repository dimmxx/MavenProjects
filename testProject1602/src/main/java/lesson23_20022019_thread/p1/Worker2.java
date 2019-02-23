package lesson23_20022019_thread.p1;

public class Worker2 implements Runnable {

    Q q;

    boolean suspend = false;


    public Worker2(Q q) {
        this.q = q;
        new Thread(this).start();
    }

    @Override
    public void run() {
        while (true){
            synchronized (q){


                if (q.x % 2 == 0) {
                    System.out.println(q.x);
                }


        }
        }


    }

    public void suspend(){
        suspend = true;
    }

    public void resume(){
        suspend = false;
        notify();
    }



}
