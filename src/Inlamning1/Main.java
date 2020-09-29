package Inlamning1;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Animal> animals = new ArrayList<>();
        animals.add(new Dog("Sixten", 5000));
        animals.add(new Dog("Dogge", 10000));
        animals.add(new Cat("Venus", 5000));
        animals.add(new Cat("Ove", 3000));
        animals.add(new Snake("Hypno", 1000));


        String name;
        while (true) {
            name = JOptionPane.showInputDialog(null, "Vilket djur ska få mat");
            if (name == null) break;
            name = name.toLowerCase();
            boolean found = false;
            for (var a : animals) {
                if (name.equals(a.getName().toLowerCase())) {
                    //Här används polymorphism.
                    String tempName = a.getName();
                    int amountOfFood = a.amountOfFood();
                    String foodType = a.foodType();
                    System.out.println(tempName + " skall ha " + amountOfFood + "gr " + foodType + ".");
                    found = true;
                }

            }
            if (!found) System.out.println("Det finns inget djur med det namnet");
        }
        System.exit(0);
    }


}

