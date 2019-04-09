package controller;

import model.Dog;

public class DogController {



    public Dog getDog() {
        Dog dog = new Dog();
        dog.setName("Max");
        dog.setAge(5);
        return dog;
    }
}
