package Inlamning1;

public class Snake extends Animal {
    protected Snake(String name, int weight) {
        super(name, weight);
    }


    public int amountOfFood() {
        return KindOfFood.SNAKE.foodIndex;
    }


    public String foodType() {
        return KindOfFood.SNAKE.foodType;
    }
}
