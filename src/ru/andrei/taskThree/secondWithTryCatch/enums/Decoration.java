package ru.andrei.taskThree.secondWithTryCatch.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Decoration {
    POST_CARD(5),
    TAPE(2),
    GIFT_WRAP(10);

    private int price;
}
