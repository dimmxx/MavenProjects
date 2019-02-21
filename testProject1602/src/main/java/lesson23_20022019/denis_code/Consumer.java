package mate.academy;

public class Consumer implements Runnable {
	Store store;

	Consumer(Store store) {
		this.store = store;
		new Thread(this, "Consumer").start();
	}

	public void run() {
		while (true) {
				store.get();
				store.notEmpty=false;
			
		}
	}
}
