package Inlamning1;

public class Cat extends Animal {
    protected Cat(String name, int weight) {
        super(name, weight);
    }

    @Override
    public int amountOfFood() {
        return getWeight() / KindOfFood.CAT.foodIndex;
    }

    @Override
    public String foodType() {
        return KindOfFood.CAT.foodType;
    }
}