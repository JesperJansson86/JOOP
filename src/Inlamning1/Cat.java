package Inlamning1;

public class Cat extends Animal {
    public Cat (String name, int weight){
        super(name, weight);
    }
@Override
    public int amountOfFood() {
        return weight / Kind.CAT.foodIndex;
    }
}