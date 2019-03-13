package lessons.lesson24.p1;

public class MainWorker {


    public static void main(String[] args) throws InterruptedException {

        Worker worker = new Worker();
        worker.suspend();
        Thread.sleep(3000);
        worker.resume();





    }


}
