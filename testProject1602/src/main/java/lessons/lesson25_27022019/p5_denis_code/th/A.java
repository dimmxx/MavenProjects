package lessons.lesson25_27022019.p5_denis_code.th;

public class A {
synchronized void b(B b) {
	System.out.println("A entered B");
//	try {
//		Thread.sleep(1000);
//	} catch (InterruptedException e) {
//		e.printStackTrace();
//	}
	System.out.println("A trying do b");
	b.doSomething();
}

synchronized void doSomething() {
	System.out.println("Doing somrthing in A");
}
}
