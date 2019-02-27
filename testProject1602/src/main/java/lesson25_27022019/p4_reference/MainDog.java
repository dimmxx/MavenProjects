package lesson25_27022019.p4_reference;

import java.lang.ref.SoftReference;

public class MainDog {

    public static void main(String[] args) {


//        Dog dog1 = new Dog();
//        Dog dog2 = new Dog();
//        Dog dog3 = new Dog();
//        Dog dog4 = new Dog();
//        Dog dog5 = new Dog();
//        Dog dog6 = new Dog();
//        Dog dog7 = new Dog();
//        Dog dog8 = new Dog();
//

//
//        new Dog();
//        new Dog();
//        new Dog();
//        new Dog();
//        new Dog();


//        SoftReference<Dog> dog1 = new SoftReference<>(new Dog());
//        SoftReference<Dog> dog2 = new SoftReference<>(new Dog());
//        SoftReference<Dog> dog3 = new SoftReference<>(new Dog());
//        SoftReference<Dog> dog4 = new SoftReference<>(new Dog());
//        SoftReference<Dog> dog5 = new SoftReference<>(new Dog());



        SoftReference<Dog> dog1 = new SoftReference<>(new Dog());
        System.gc();
        System.out.println(dog1.get());

        SoftReference<Dog> dog2 = new SoftReference<>(new Dog());
        System.gc();
         System.out.println(dog1.get());
        SoftReference<Dog> dog3 = new SoftReference<>(new Dog());
        System.gc();
        SoftReference<Dog> dog4 = new SoftReference<>(new Dog());
        System.gc();
        SoftReference<Dog> dog5 = new SoftReference<>(new Dog());
        System.gc();





    }


}
