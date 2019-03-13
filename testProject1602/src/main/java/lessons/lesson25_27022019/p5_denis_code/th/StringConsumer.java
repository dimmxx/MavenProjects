package lessons.lesson25_27022019.p5_denis_code.th;

import java.util.concurrent.Exchanger;

public class StringConsumer implements Runnable {
Exchanger<String> ex;

	public StringConsumer(Exchanger<String> ex) {
	this.ex = ex;
	new Thread(this).start();
}

	@Override
	public void run() {
		for(int i=0;i<5;i++) {	
			try {
				String str=ex.exchange("OK, Thank you");
				System.out.println("Consumer: Receved "+str);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}
