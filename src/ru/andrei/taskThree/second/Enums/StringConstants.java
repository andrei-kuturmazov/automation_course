package ru.andrei.taskThree.second.Enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum StringConstants {

    FLOWERS_COUNT_INPUT("Hello, please select a number of flowers"),
    LOWERS_COLOR_SELECT ("Please, select a flower color"),
    FLOWERS_TYPE_SELECT ("Please, select a flower type among following: Rose, Clove, Peony");

    private String description;


}
