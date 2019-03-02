package ref;

import java.lang.ref.WeakReference;

public class DogCachier {
	WeakReference<Dog> wr=new WeakReference<Dog>(null);
	
	Dog getDog() {
		Dog dog=null;
		String message="Cachied Dog";
		if(wr.get()==null) {
			dog=new Dog();
			wr=new WeakReference<Dog>(dog);
			dog=null;
			 message="Created Dog";
		}
		System.out.println(message);
		return wr.get();
	}
}
