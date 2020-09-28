package Inlamning1;

public class Cat extends Animal {
    protected Cat(String name, int weight) {
        super(name, weight);
    }

    @Override
    public int amountOfFood() {
        return getWeight() / Kind.CAT.foodIndex;
    }

    @Override
    public String foodType() {
        return Kind.CAT.foodType;
    }
}