package Inlamning1;

abstract class Animal implements Food {
    //Inkapsling
    protected int weight;
    //Inkapsling
    protected String name;
    //Inkapsling
    public String getName() {
        return name;
    }
    //Inkapsling
    public void setName(String name) {
        if (name != null) this.name = name;
        else throw new IllegalArgumentException("Name cannot be null");
    }
    //Inkapsling
    public int getWeight() {
        return weight;
    }
    //Inkapsling
    public void setWeight(int weight) {
        if (weight > 0) this.weight = weight;
        else throw new IllegalArgumentException("Weight must be larger that zero.");
    }

    public Animal(String name, int weight) {
        setName(name);
        setWeight(weight);
    }

/*
    @Override
    public int amountOfFood() {
        return 0;
    }

    @Override
    public String foodType() {
        return null;
    }
*/


}
