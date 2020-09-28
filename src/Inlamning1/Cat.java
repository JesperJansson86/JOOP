package Inlamning1;

public class Cat extends Animal {
    public Cat (String name, int weight){
        super(name, weight);
    }

    public int amountOfFood() {
        return weight / 150;
    }
}