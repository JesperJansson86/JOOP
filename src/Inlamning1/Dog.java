package Inlamning1;

public class Dog extends Animal {
    //Konstruktor
    protected Dog(String name, int weight) {
        super(name, weight);
    }

    @Override
    public int amountOfFood() {
        return getWeight() / Kind.DOG.foodIndex;
    }
                                                        //Här använder jag enumet DOG.foodIndex
    @Override
    public String foodType() {
        return Kind.DOG.foodType;
    }
}
