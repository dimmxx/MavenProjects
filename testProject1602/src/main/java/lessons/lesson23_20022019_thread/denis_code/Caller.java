package mate.academy;

public class Caller implements Runnable {
	Callme callme;
	String msg;

	public Caller(Callme callme, String msg) {
		super();
		this.callme = callme;
		this.msg = msg;
		new Thread(this).start();
	}

	public void run() {
		synchronized (callme) {
			callme.getString(msg);
		}
	}

}
