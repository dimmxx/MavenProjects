package homework.homework24;

import java.util.concurrent.Semaphore;

public class Transport {

    protected String name;
    protected Heap1 heap1;
    protected Barrow barrow;

    protected Semaphore loader;
    protected Semaphore transport;
    protected Semaphore unloader;

    public Transport(Heap1 heap1, Barrow barrow, Semaphore loader, Semaphore transport, Semaphore unloader) {
        this.name = "Transport";
        this.heap1 = heap1;
        this.barrow = barrow;
        this.loader = loader;
        this.transport = transport;
        this.unloader = unloader;
    }
}
