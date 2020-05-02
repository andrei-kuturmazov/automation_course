package ru.andrei.taskThree.secondWithTryCatch.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum FlowerColor {
    RED("red"),
    WHITE("white"),
    PURPLE("purple");

    private String description;

    @Override
    public String toString() {
        return getDescription();
    }
}
