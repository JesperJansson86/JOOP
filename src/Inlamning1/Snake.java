package Inlamning1;

public class Snake extends Animal {
    public Snake (String name, int weight){
        super(name, weight);
    }
@Override
    public int amountOfFood() {
        return Kind.SNAKE.foodIndex;
    }
}
