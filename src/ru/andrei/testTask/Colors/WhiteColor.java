package ru.andrei.testTask.Colors;

import lombok.Getter;

@Getter
public class WhiteColor implements Color {

    private final String color = "white";

    @Override
    public String toString() {
        return getColor();
    }
}
