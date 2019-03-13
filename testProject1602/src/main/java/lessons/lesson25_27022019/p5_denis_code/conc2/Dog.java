package lessons.lesson25_27022019.p5_denis_code.conc2;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public class Dog implements Callable<String>{
String text;
	protected Dog(String text) {
	this.text = text;
}
	@Override
	public String call() throws Exception {
		TimeUnit.SECONDS.sleep(3);
		return "Some text from Dog : "+text;
	}

}
