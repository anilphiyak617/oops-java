class Animal {}

class Dog extends Animal {}

class Cat extends Animal {}

public class InstanceOf {
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        Dog dog1 = new Dog();
        Cat cat1 = new Cat();
        
        System.out.println(animal1 instanceof Animal);
        System.out.println(dog1 instanceof Dog);
        System.out.println(cat1 instanceof Cat);
        System.out.println(dog1 instanceof Animal);
        // cannot be checked because cat1 and Dog are not related via inheritance
        System.out.println(cat1 instanceof Dog);
    }
}