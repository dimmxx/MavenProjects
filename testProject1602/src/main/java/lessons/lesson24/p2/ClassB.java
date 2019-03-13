package lessons.lesson24.p2;

public class ClassB {


    void a (ClassA a){

        System.out.println("A entered B");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("B trying do A");
        a.doSomething();

    }

    void doSomething(){
        System.out.println("Doing in ClassB");
    }







}
