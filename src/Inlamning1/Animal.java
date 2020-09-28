package Inlamning1;

public class Animal implements Food{
    protected int weight;
    protected String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name!=null)this.name = name;
        else throw new IllegalArgumentException("Name cannot be null");
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if (weight > 0) this.weight = weight;
        else throw new IllegalArgumentException("Weight must be larger that zero.");
    }
    public Animal(String name,int weight){
        setName(name);
        setWeight(weight);
    }

    @Override
    public int amountOfFood() {
        return 0;
    }
}
