package mate.academy.p6_getclass;

public class Main {


    public static void main(String[] args) {


        AnimalClass dog = new AnimalClass("John", 10);
        AnimalClass cat = new AnimalClass("Mary", 8);


        System.out.println(dog.getClass() == cat.getClass());





    }






}
