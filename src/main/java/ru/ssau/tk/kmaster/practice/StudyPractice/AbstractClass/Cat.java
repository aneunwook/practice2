package ru.ssau.tk.kmaster.practice.StudyPractice.AbstractClass;

public class Cat extends Animal {

	@Override
	public void makeSound() {
		System.out.println("야옹.");
		
	}
	
	public void catOnly() {
		System.out.println("고양이만 입장 가능~");
	}
   
	public void catWorld() {
		System.out.println("고양이 놀이공원");
	}
}
