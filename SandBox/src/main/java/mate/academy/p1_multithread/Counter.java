package mate.academy.p1_multithread;

public class Counter {

    private long counter = 0L;

    public  synchronized void increaseCounter() {
        counter++;
    }

    public long getCounter() {
        return counter;
    }
}


