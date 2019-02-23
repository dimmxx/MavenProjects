package mate.academy;

public class QM {

	public static void main(String[] args) {
	Q q=new Q();
		new Worker1(q);
		Worker2 worker2=	new Worker2(q);
//		Store store=new Store();
//		new Producer(store);
//		try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		new Consumer(store);
	}

}
