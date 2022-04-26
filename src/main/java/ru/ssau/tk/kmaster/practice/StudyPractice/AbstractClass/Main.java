package ru.ssau.tk.kmaster.practice.StudyPractice.AbstractClass;

public class Main {
    public static void main(String[] args) {
        /*

		분석:
 
		animal이라는 부모추상클래스를 선언하고 자식 클래스인 cat 클래스와 dog 클래스가 extends를 받아
		animal의 makeSound method 를 override 받아 자식클래스에서 재정의를 함
		
		수정 & 추가 사항 : 
		
		Original 소스에는 자식클래스들이 extends 를 받았지만 override annotation 선언이
		되어있지 않아서 override annotation 를 선언해줬다.
		
		Animal 이라는 추상클래스에 있는 letsGo method 를 자식클래스가 따로 선언을 하지 않아도
		사용 할 수 있지만, 자식 클래스에 선언된 method(ex: catOnly) 는 부모클래스가 사용하지 못한다.
		
		자신의 고유한 특성을 잃은 Cat 클래스의 객체를 다시 복구 시켜주기 위해
		다운캐스팅을 해주었다.

         */
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
