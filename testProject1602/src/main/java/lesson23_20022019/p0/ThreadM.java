package lesson23_20022019.p0;

public class ThreadM {

    public static void main(String[] args) {
        Callme callme = new Callme();

        new Caller(callme, "A");
        new Caller(callme, "B");
        new Caller(callme, "C");

    }


}
