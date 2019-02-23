package lesson23_20022019_thread.p1;

public class QM {

    public static void main(String[] args) {

        Q q = new Q();

        new Worker1(q);
        new Worker2(q);


    }



}
