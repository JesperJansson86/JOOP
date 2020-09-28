package Inlamning1;

public class Dog extends Animal{
    public Dog (String name, int weight){
        super(name, weight);
    }
    @Override
    public int amountOfFood(){
        return weight/Kind.DOG.foodIndex;
    }
}
