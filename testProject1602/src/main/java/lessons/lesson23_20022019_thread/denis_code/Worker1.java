package mate.academy;

public class Worker1 implements Runnable{
Q q;
	public Worker1(Q q) {
	super();
	this.q = q;
	new Thread(this).start();
}
	public void run() {
		while(true) {
			q.x++;
		}
	}

}
