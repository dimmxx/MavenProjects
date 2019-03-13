package lessons.lesson24.p2;

public class ClassA {

    void b (ClassB b){

        System.out.println("A entered B");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("A trying do B");
        b.doSomething();

    }

    void doSomething(){
        System.out.println("Doing in ClassA");
    }
}
