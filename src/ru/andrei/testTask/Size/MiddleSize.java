package ru.andrei.testTask.Size;

import lombok.Getter;

@Getter
public class MiddleSize implements FlowerSize {

    private final String size = "middle";

    @Override
    public String toString() {
        return getSize();
    }

}
