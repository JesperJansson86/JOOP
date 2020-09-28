package Inlamning1;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Animal a1 = new Dog("Sixten", 5000);
        Animal a2 = new Dog("Dogge", 10000);
        Animal a3 = new Cat("Venus", 5000);
        Animal a4 = new Cat("Ove", 3000);
        Animal a5 = new Snake("Hypno", 1000);
        List<Animal> animals = new ArrayList<Animal>();
        animals.add(a1);
        animals.add(a2);
        animals.add(a3);
        animals.add(a4);
        animals.add(a5);
//        System.out.println(d1.amountOfFood());
//        System.out.println(d2.amountOfFood());
//        System.out.println(c1.amountOfFood());
//        System.out.println(c2.amountOfFood());
//        System.out.println(s1.amountOfFood());
        String name;
        while (true) {
            name = JOptionPane.showInputDialog(null, "Vilket djur ska få mat");
            if (name == null) break;
            for (int i = 0; i < 5; i++) {
                if (name.equals(animals.get(i).getName())) System.out.println(animals.get(i).amountOfFood());

            }
        }
    }
}

