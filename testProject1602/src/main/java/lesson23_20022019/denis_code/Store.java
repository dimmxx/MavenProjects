package mate.academy;

public class Store {
boolean notEmpty;
	int n;
	synchronized int get(){
		while(!notEmpty) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Получено:"+n);
		int swap=n;
		n=0;
		notEmpty=false;
		notify();
		return swap;
	}
	synchronized void put(int n){
		 while(notEmpty) {
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
		 }
		this.n=n;
		System.out.println("Отправлено:"+this.n);
	notEmpty=true;
	notify();
		 }

}
