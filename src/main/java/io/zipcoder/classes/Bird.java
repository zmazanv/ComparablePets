package io.zipcoder.classes;

public class Bird extends Pet {
    public Bird(String name) {
        super(name);
    }

    @Override
    public String speak() {
        return "Squawk";
    }
}
