package ru.andrei.taskThree.secondWithTryCatch.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum FlowerSize {
    HIGH("high"),
    MIDDLE("middle"),
    SMALL("small");

    private String description;

    @Override
    public String toString() {
        return getDescription();
    }
}
