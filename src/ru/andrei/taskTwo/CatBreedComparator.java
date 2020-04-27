package ru.andrei.taskTwo;

import java.util.Comparator;

public class CatBreedComparator implements Comparator<Cat> {
    @Override
    public int compare(Cat first, Cat second) {
        return first.getBreed().compareTo(second.getBreed());
    }
}
