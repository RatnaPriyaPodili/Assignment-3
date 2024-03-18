package Assignment3;

//Animal class
class Animal {
 public void makeSound() {
     System.out.println("Animal makes a sound");
 }
}

//Dog class inheriting from Animal
class Dog extends Animal {
 // Method overloading
 public void makeSound(String sound) {
     System.out.println("Dog barks: " + sound);
 }

 // Method overriding
 @Override
 public void makeSound() {
     System.out.println("Dog barks");
 }
}

public class OverLoadingAndOverRiding {
 public static void main(String[] args) {
     // Method overloading example
     Dog dog1 = new Dog();
     dog1.makeSound(); // Calls the overridden method
     dog1.makeSound("Woof"); // Calls the overloaded method
 }
}