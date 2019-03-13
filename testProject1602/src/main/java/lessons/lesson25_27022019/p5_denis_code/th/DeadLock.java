package lessons.lesson25_27022019.p5_denis_code.th;

public class DeadLock implements Runnable{
A a=new A();
B b=new B();
DeadLock(){
	new Thread(this).start();
	a.b(b);
}
	public void run() {
		b.a(a);
	}

}
