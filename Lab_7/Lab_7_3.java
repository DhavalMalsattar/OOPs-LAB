package Lab_7;

import java.util.*;


class Animal{
    public void makeSound(){
       System.out.println("The animal makes a sound");
    }
   
}
class Dog extends Animal{
    public void makeSound(){
        System.out.println("Woof!");
     }
}
class Cat extends Animal{
    public void makeSound(){
        System.out.println("Meow!");
     }
}

public class Lab_7_3
{
	public static void main(String[] args) {
	    Animal a1 = new Animal();
        Dog d1 = new Dog();
        Cat c1 = new Cat();
        a1.makeSound();
        d1.makeSound();
        c1.makeSound();
       
	    
	}
}
