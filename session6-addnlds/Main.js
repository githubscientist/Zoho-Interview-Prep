class Animal {
    sound() {
        console.log('Animal makes a sound');
    }
}

class Dog extends Animal {
    // sound() {
    //     console.log('Dog barks');
    // }
}

let dog = new Dog();
dog.sound(); // Dog barks