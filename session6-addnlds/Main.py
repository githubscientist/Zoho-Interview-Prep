# inheritance
class Animal:
    def sound(self):
        print("Animal makes a sound")


class Dog(Animal):
    def sound(self):
        print("Dog barks")


def main():
    # animal = Animal()
    # animal.sound()

    dog = Dog()
    dog.sound()


if __name__ == "__main__":
    main()
