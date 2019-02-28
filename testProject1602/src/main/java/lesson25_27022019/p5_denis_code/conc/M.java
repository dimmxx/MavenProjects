package conc;

import java.util.concurrent.Semaphore;

public class M {

	public static void main(String[] args) {
		Semaphore s=new Semaphore(1);
		new Worker("A",s);
		new Worker("B",s);
	}

}
