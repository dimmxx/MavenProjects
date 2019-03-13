package lessons.lesson26_02032019_xml_parse.p3_denis_code;

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
