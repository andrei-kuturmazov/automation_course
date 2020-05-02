package ru.andrei.testTask.Size;

import lombok.Getter;

@Getter
public class BigSize implements FlowerSize {

    private final String size = "big";

    @Override
    public String toString() {
        return getSize();
    }

}
