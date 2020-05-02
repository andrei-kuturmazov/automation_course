package ru.andrei.taskThree.secondWithTryCatch.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum StringConstants {
    USER_INVITATION("Hello, nice to meet you in our flower shop, please select flower count for your bouquet"),
    FLOWER_SELECTION("Please select flowers 4 your bouquet, we provide flowers: Rose, Peony, Clove with red, white or purple colors and following sizes: small, middle, high"),
    USER_ORDER("Your order is:"),
    DECORATION_PROPOSAL("Do U wanna add some decoration to your bouquet?"),
    BOUQUET_COUNT("Bouquet price is: %d");

    private String description;
}
