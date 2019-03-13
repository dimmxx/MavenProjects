package lessons.lesson25_27022019.p5_denis_code.conc2;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class DogMain {

	public static void main(String[] args) {
		ExecutorService es=Executors.newFixedThreadPool(3);
		Future<String> f1;
		Future<String> f2;
		Future<String> f3;
		f1=es.submit(new Dog("Scratch"));
		f2=es.submit(new Dog("Seat"));
		f3=es.submit(new Dog("Sleep"));
		try {
			System.out.println(f1.get());
			System.out.println(f2.get());
			System.out.println(f3.get());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		es.shutdown();
	}

}
