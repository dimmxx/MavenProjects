package lessons.lesson25_27022019.p5_denis_code.th;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.TimeUnit;

public class Man implements Runnable{
CyclicBarrier cb;
String name;

	public Man(CyclicBarrier cb, String name) {
	this.cb = cb;
	this.name = name;
	new Thread(this).start();
}

	public void run() {
		System.out.println(name +" : started");
		try {
			TimeUnit.SECONDS.sleep((long)(Math.random()*5+3));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(name +" : finished");
		try {
			cb.await();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (BrokenBarrierException e) {
			e.printStackTrace();
		}
		
		
		
		
	}

}
