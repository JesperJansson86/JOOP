package Inlamning1;

public class Cat extends Animal {
    //Konstruktor
    protected Cat(String name, int weight) {
        super(name, weight);
    }


    public int amountOfFood() {
        return getWeight() / KindOfFood.CAT.foodIndex;
    }


    public String foodType() {
        return KindOfFood.CAT.foodType;
    }
}