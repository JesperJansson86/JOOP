package Inlamning1;

public class Dog extends Animal {
    //Konstruktor
    protected Dog(String name, int weight) {
        super(name, weight);
    }


    public int amountOfFood() {
        return getWeight() / KindOfFood.DOG.foodIndex;
    }
    //Här använder jag enumet DOG.foodIndex

    public String foodType() {
        return KindOfFood.DOG.foodType;
    }
    //Här använder jag enumet DOG.foodType
}

