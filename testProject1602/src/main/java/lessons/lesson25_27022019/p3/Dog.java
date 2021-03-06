package lessons.lesson25_27022019.p3;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public class Dog implements Callable <String>{

    private String text;

    protected Dog(String text) {
        this.text = text;
    }

    @Override
    public String call() throws Exception {

        TimeUnit.SECONDS.sleep(3);
        return "Some text from Dog: " + text;
    }
}
