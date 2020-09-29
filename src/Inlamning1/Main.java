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
            int count =0;
            for (int i = 0; i < animals.size(); i++,count++) {
                if (name.equals(animals.get(i).getName().toLowerCase())) {
                    //Här används polymorphism.
                    String tempName = animals.get(i).getName();
                    int amountOfFood = animals.get(i).amountOfFood();
                    String foodType = animals.get(i).foodType();
                    System.out.println(tempName+" skall ha "+amountOfFood+"gr "+foodType+".");
                    count = animals.size()+1;
                }

            }if (count == animals.size()) System.out.println("Det finns inget djur med det namnet");
        }
    }


}

