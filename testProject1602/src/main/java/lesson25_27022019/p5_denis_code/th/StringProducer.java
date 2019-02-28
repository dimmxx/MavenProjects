package th;

import java.util.concurrent.Exchanger;
import java.util.concurrent.TimeUnit;

public class StringProducer implements Runnable {
	Exchanger<String> ex;
	String str="";

	public StringProducer(Exchanger<String> ex) {
		this.ex = ex;
		new Thread(this).start();
	}

	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				str+=(char)((int)(Math.random()*23+98));
			}
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			try {
				System.out.println("PRODUCER: Pushed "+str);
				str=ex.exchange(str);
				System.out.println("PRODUCER: Received "+str);
				str="";
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
