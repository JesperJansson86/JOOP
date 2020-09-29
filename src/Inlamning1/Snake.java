package Inlamning1;

public class Snake extends Animal {
    protected Snake(String name, int weight) {
        super(name, weight);
    }

    @Override
    public int amountOfFood() {
        return KindOfFood.SNAKE.foodIndex;
    }

    @Override
    public String foodType() {
        return KindOfFood.SNAKE.foodType;
    }
}
