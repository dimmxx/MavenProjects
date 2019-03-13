package lessons.lesson24.p3_concur;

public class Main {

    public static void main(String[] args) {


        Object obj = new Object();
        new Worker("A", obj);
        new Worker("B", obj);


    }


}
