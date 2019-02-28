package conc2;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class WorkerMain {

	public static void main(String[] args) {
		CountDownLatch cdl1=new CountDownLatch(5);
		CountDownLatch cdl2=new CountDownLatch(5);
		CountDownLatch cdl3=new CountDownLatch(5);
		CountDownLatch cdl4=new CountDownLatch(5);
		ExecutorService ex=Executors.newFixedThreadPool(2);
	System.out.println("Executor started");
		ex.execute(new Worker("A",cdl1));
		ex.execute(new Worker("B",cdl2));
		ex.execute(new Worker("C",cdl3));
		ex.execute(new Worker("D",cdl4));
		try {
			cdl1.await();
			cdl2.await();
			cdl3.await();
			cdl4.await();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		ex.shutdown();
		System.out.println("End");
	}

}
