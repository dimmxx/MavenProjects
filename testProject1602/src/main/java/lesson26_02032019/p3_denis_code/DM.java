package ref;

public class DM {

	public static void main(String[] args) {
		DogCachier dc=new DogCachier();
		System.out.println("Start");
		dc.getDog();
		dc.getDog();
		System.gc();
		dc.getDog();

	}

}
