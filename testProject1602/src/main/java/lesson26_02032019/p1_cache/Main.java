package lesson26_02032019.p1_cache;

public class Main {


    public static void main(String[] args) {

        DogCache dc = new DogCache();

        System.out.println("Start");

        dc.getDog();
        dc.getDog();
        System.gc();
        dc.getDog();







    }
}
