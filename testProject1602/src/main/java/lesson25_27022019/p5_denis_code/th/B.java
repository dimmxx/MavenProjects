package th;

public class B {
	synchronized void a(A a) {
		System.out.println("B entered A");
//		try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		System.out.println("B trying do a");
		a.doSomething();
	}
	synchronized void  doSomething() {
		System.out.println("Doing something in B");
	}
}
