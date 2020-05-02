package ru.andrei.taskThree.secondWithTryCatch.flowers;

import lombok.Getter;
import ru.andrei.taskThree.secondWithTryCatch.enums.FlowerColor;
import ru.andrei.taskThree.secondWithTryCatch.enums.FlowerSize;


@Getter
public class Rose extends Flower {

    private final int price;

    public Rose(FlowerColor color, FlowerSize size) {
        super(color, size);
        this.price = 30;
    }

    @Override
    public String toString() {
        return String.format("Rose with following attributes: color: %s; size: %s", super.getFlowerColor(), super.getFlowerSize());
    }
}
