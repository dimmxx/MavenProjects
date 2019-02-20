package lesson20022019;

public class Callme {


    //synchronized void getString (String msg){
    void getString (String msg){

        System.out.print("[" + msg);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.print("]");
    }


}
