package th;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;

public class CDLM {

	public static void main(String[] args) {
	/*	CountDownLatch cdl=new CountDownLatch(5);
		System.out.println("Start");
		new Latcher(cdl);
		try {
			cdl.await();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("End");
*/
		CyclicBarrier cb=new CyclicBarrier(5,()->System.out.println("Busssss"));
				for(int i=0;i<10;i++) {
					new Man(cb,"Man"+i);
				}
	}

}
