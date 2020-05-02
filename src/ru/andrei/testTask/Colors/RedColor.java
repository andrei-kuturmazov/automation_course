package ru.andrei.testTask.Colors;

import lombok.Getter;

@Getter
public class RedColor implements Color {

    private final String color = "red";

    @Override
    public String toString() {
        return getColor();
    }
}
