package th;

public class TMM {

	public static void main(String[] args) throws InterruptedException {
		Worker worker=new Worker();
		Thread.sleep(3000);
		worker.suspend();
		Thread.sleep(3000);
		worker.resume();

	}

}
