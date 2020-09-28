package Inlamning1;

public class Main {
    public static void main(String[] args) {
        Animal d1 = new Dog("Sixten",5000);
        Animal d2 = new Dog("Dogge", 10000);
        Animal c1 = new Cat("Venus",5000);
        Animal c2 = new Cat("Ove",3000);
        Animal s1 = new Snake("Hypno",1000);

        System.out.println(d1.amountOfFood());
        System.out.println(d2.amountOfFood());
        System.out.println(c1.amountOfFood());
        System.out.println(c2.amountOfFood());
        System.out.println(s1.amountOfFood());
    }
}

