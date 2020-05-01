package ru.andrei.taskThree.second.Flowers;

import lombok.AllArgsConstructor;
import lombok.Getter;
import ru.andrei.taskThree.second.Flowers.Flower;

@AllArgsConstructor
@Getter
public class Peony extends Flower {
    private int price;
    private String color;
}
