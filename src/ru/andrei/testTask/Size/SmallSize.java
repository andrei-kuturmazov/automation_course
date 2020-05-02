package ru.andrei.testTask.Size;

import lombok.Getter;

@Getter
public class SmallSize implements FlowerSize {

    private final String size = "small";

    @Override
    public String toString() {
        return getSize();
    }
}
