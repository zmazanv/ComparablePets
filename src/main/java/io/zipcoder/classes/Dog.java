package io.zipcoder.classes;

public class Dog extends Pet {
    public Dog(String name) {
        super(name);
    }

    @Override
    public String speak() {
        return "Bark";
    }
}
