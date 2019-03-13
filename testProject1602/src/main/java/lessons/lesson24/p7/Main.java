package lessons.lesson24.p7;

import java.util.concurrent.Exchanger;

public class Main {

    public static void main(String[] args) {

        Exchanger<String> ex = new Exchanger<>();
        new StringProducer(ex);
        new StringConcumer(ex);

    }


}
