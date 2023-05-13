package io.zipcoder.classes.comparators;

import java.util.Comparator;
import io.zipcoder.classes.Pet;

public class PetComparator implements Comparator<Pet> {
    @Override
    public int compare(Pet petOne, Pet petTwo) {
        int nameComparison = petOne.getClass().getSimpleName().compareTo(petTwo.getClass().getSimpleName());
        if (nameComparison == 0 ) {
            return petOne.getName().compareTo(petTwo.getName());
        }
        return nameComparison;
    }
}
