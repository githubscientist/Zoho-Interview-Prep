// define a parent class
class Animal {
    void sound() {
        System.out.println("Animal is making a sound");
    }
}

// define a child class
class Dog extends Animal {
    void sound() {
        System.out.println("Dog is barking");
    }
}

public class Main {
    public static void main(String[] args) {
        // create an object of the parent class
        // Animal myAnimal = new Animal();
        // myAnimal.sound();

        // create an object of the child class
        Dog myDog = new Dog();
        myDog.sound();

        // create an object of the parent class
        // Animal myAnimal = new Animal();
        // myAnimal.sound();

        // create an object of the child class
        Animal myDog2 = new Dog();
        myDog2.sound();
    }
}
