package ru.andrei.taskTwo;

import java.util.Comparator;

public class CatAgeComparator implements Comparator<Cat> {
    @Override
    public int compare(Cat first, Cat second) {
        return first.getAge() - second.getAge();
    }
}
