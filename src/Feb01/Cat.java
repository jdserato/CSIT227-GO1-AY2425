package Feb01;

public class Cat extends Animal{
    // CONSTRUCTOR
    Cat(String name) {
        super(name);
    }

    String makeSound() {
        return "Meow meow my name is " + name;
    }

    @Override
    public String toString() {
        return "Cat " + super.toString();
    }
}
