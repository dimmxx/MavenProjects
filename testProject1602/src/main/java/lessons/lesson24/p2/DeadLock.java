package lessons.lesson24.p2;

public class DeadLock implements Runnable {

    ClassA a = new ClassA();
    ClassB b = new ClassB();

    public DeadLock() {
        new Thread(this).start();
        a.b(b);
    }

    @Override
    public void run() {

        b.a(a);

    }
}
