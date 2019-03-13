package lessons.lesson25_27022019.p5_denis_code.conc2;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class Worker2 implements Runnable {
	String name;
CountDownLatch cdl;
	public Worker2(String name,CountDownLatch cdl) {
		this.name = name;
		this.cdl=cdl;
	}
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(name+":"+i);
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			cdl.countDown();
		}
		

	}

}
