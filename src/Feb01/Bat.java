package Feb01;

public class Bat extends Mammal implements Flyer{
    Bat(String name) {
        super(name);
    }

    @Override
    String makeSound() {
        return "kikik";
    }

    @Override
    public void fly() {
        System.out.println(name + " is flying in a cave");
    }
}
