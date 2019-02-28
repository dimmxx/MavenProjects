package th;

import java.util.concurrent.Exchanger;

public class EXM {

	public static void main(String[] args) {
		Exchanger<String> ex=new Exchanger<>();
		new StringProducer(ex);
		new StringConsumer(ex);
	}

}
