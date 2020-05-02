package ru.andrei.testTask.Colors;

import lombok.Getter;

@Getter
public class PurpleColor implements Color {

    private final String color = "purple";

    @Override
    public String toString() {
        return getColor();
    }
}
