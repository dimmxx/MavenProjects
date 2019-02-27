package lesson25_27022019.p4_reference;

import java.util.Arrays;

public class Dog {

    int[][] array = new int[10000][10000];


    public Dog() {
        System.out.println("Dog created");
    }


    @Override
    protected void finalize() throws Throwable {
        System.out.println("Deleting dog");

    }

    @Override
    public String toString() {
        return "Dog{" +
                "array=" + Arrays.toString(array) +
                '}';
    }
}
