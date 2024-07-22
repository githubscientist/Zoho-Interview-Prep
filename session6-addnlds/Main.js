class Animal {

    constructor(name) {
        this.name = name;
    }

    sound() {
        console.log('Animal makes a sound');
    }
}

class Dog extends Animal {

    constructor(name) {
        super(name);
    }

    sound() {
        super.sound();
        console.log('Dog barks');
    }
}

let dog = new Dog('Dog');
dog.sound(); // Dog barks
print(dog.name); // Dog