package ru.ssau.tk.kmaster.practice.StudyPractice.Generics;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Animal> listOfAnimal = new ArrayList<>();
        listOfAnimal.add(new Animal(1));
        listOfAnimal.add(new Animal(2));
        listOfAnimal.add(new Animal(3));

        List<Dog> listOfDog = new ArrayList<>();
        listOfDog.add(new Dog(9));
        listOfDog.add(new Dog(10));

        test1(listOfAnimal);
        test2(listOfDog);
    }

    private static void test1(List<? extends Animal> list) {
        for (Animal animal : list) {
            System.out.println(animal);
            animal.eat();
        }
    }
    private  static  void test2(List<?> list) {
        for (var animal : list) {
            System.out.println(animal);
            //animal.eat(); - не работает
        }
    }
}
