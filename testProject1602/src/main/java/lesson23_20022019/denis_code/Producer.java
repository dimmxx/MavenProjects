package mate.academy;

public class Producer implements Runnable {
	Store store;

	Producer(Store store) {
		this.store = store;
		new Thread(this, "Producer").start();
	}

	public void run() {
		int i = 0;
		while (true) {
				i++;
				store.put(i);
		}
	}
}
