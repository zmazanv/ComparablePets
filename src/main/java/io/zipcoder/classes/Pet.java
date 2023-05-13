package io.zipcoder.classes;

public abstract class Pet implements Comparable<Pet> {
    private String name;

    public Pet(String name) {
        StringBuilder titledName = new StringBuilder(name);
        for (int i = 0; i < titledName.length(); i++) {
            if (i == 0) {
                titledName.setCharAt(i, Character.toUpperCase(titledName.charAt(i)));
            } else {
                titledName.setCharAt(i, Character.toLowerCase(titledName.charAt(i)));
            }
        }
        this.name = titledName.toString();
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract String speak();

    @Override
    public int compareTo(Pet otherPet) {
        return this.name.compareTo(otherPet.name);
    }

    @Override
    public String toString() {
        return (this.getName() + " is a " + this.getClass().getSimpleName() + " who " + this.speak().toLowerCase() + "s");
    }
}
