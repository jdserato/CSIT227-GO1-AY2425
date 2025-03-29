package Feb01;

public class Dog extends Mammal {
    public Dog(String name) {
        super(name);
    }

    public Dog() {
        super("Browny");
    }

    String makeSound() {
        return "Aw aw";
    }

    @Override
    public String toString() {
        return "Dog " + super.toString();
    }
}
