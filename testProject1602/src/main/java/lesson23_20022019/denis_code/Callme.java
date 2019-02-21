package mate.academy;

public class Callme {
	void getString(String msg) {
		System.out.print("[" + msg);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	System.out.print("]");
	}
}