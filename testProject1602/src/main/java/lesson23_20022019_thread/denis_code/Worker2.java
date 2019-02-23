package mate.academy;

public class Worker2 implements Runnable {
	Q q;
	boolean suspend = false;

	public Worker2(Q q) {
		this.q = q;
		new Thread(this).start();
	}

	public void suspend() {
		suspend = true;
	}

	public void resume() {
		suspend = false;
		notify();
	}

	public void run() {
		while (true) {
			synchronized (q) {
				if (suspend) {
					try {
						wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				if (q.x % 2 == 0)
					System.out.println(q.x);
			}
		}
	}
}