package ru.andrei.taskTwo;

import java.util.*;

public class Main {
    public static void main(String... args) {
        Comparator<Cat> customComparator = new CatBreedComparator().thenComparing(new CatAgeComparator());
        List<Cat> catsList = new ArrayList();
        Set<Cat> catsSet = new TreeSet(customComparator);
/**
 *  Adding several cats with the same checking params inside comparators to Treeset for custom comparators check
 *  and comparing/adding rule to set, Every cat are safe :)
 */
        catsSet.add(new Cat("Ann", 10, 11, "British"));
        catsSet.add(new Cat("Vasili", 8, 6,  "Persian"));
        catsSet.add(new Cat("Vasili", 8, 3,  "Persian"));
        catsSet.add(new Cat("Stepan", 4, 4,  "Homeless"));
        catsSet.add(new Cat("Vasili", 5, 3,  "Russian"));
        catsSet.add(new Cat("Star", 1, 2,  "Arabian"));
        returnOneCatFromSet(catsSet);

        catsList.add(new Cat("Triss", 10, 11, "Kaedwen"));
        catsList.add(new Cat("Yen", 8, 6,  "Vengeberg"));
        catsList.add(new Cat("Fringilia", 5, 3,  "Aedirn"));
        returnAllCatsFromList(catsList);
    }

    /**
     * Method for cat info output with limit param
     * @param cats
     */
    public static void returnOneCatFromSet(Set<Cat> cats) {
            cats.stream()
                    .filter(cat -> cat.getName() == "Vasili")
                    .limit(1)
                    .forEach(System.out::println);
        }

    /**
     * Method for cats info output with sorting by age
     * @param cats
     */
     public static void returnAllCatsFromList(List<Cat> cats){
        cats.stream()
                .sorted(Comparator.comparingInt(Cat::getAge))
                .forEach(System.out::println);
     }

}
