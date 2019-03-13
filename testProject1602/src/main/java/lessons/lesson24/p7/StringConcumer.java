package lessons.lesson24.p7;

import java.util.concurrent.Exchanger;

public class StringConcumer implements Runnable{

    Exchanger<String> ex;

    public StringConcumer(Exchanger<String> ex) {
        this.ex = ex;
        new Thread(this).start();
    }

    @Override
    public void run() {

        for (int i = 0; i < 5; i++) {
            try {
                String str = ex.exchange(" ..from consumer: OK. Thank you");
                System.out.println("Consumer: Received " + str);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
