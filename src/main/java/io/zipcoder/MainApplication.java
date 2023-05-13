package io.zipcoder;

import java.util.*;
import io.zipcoder.classes.*;

public class MainApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many pets do you have?: ");
        int numberOfPetsOwned = scanner.nextInt();
        scanner.nextLine();
        Map<String, String> petMap = new TreeMap<>();

        for (int i = 0; i < numberOfPetsOwned; i++) {
            System.out.print("What is pet " + (i + 1) + "'s name?: ");
            StringBuilder petName = new StringBuilder(scanner.nextLine());
            for (int ii = 0; ii < petName.length(); ii++) {
                if (ii == 0) {
                    petName.setCharAt(ii, Character.toUpperCase(petName.charAt(ii)));
                } else {
                    petName.setCharAt(ii, Character.toLowerCase(petName.charAt(ii)));
                }
            }
            System.out.print("What kind of pet is " + petName + "?: ");
            String petType = scanner.nextLine().toLowerCase();
            petMap.put(petName.toString(), petType);
        }

        scanner.close();

        Set<Pet> petSet = new TreeSet<>();

        for (Map.Entry<String, String> petMapEntry : petMap.entrySet()) {
            switch (petMapEntry.getValue()) {
                case "bird" -> petSet.add(new Bird(petMapEntry.getKey()));
                case "cat" -> petSet.add(new Cat(petMapEntry.getKey()));
                case "dog" -> petSet.add(new Dog(petMapEntry.getKey()));
            }
        }
        System.out.println(petSet);
    }
}
