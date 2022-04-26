package ru.ssau.tk.kmaster.practice.StudyPractice.AbstractClass;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Cat();
        Animal dog = new Dog();
            
        Cat cat2 = new Cat();
        
        cat.makeSound();
        dog.makeSound();
        
        cat2.letsGo();
        
        //cat.catOnly();/
        cat2.catOnly();
        
        Cat catDown= (Cat)cat;
        
        catDown.catWorld();
        catDown.letsGo();
       
    }
}
