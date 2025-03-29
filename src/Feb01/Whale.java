package Feb01;

public class Whale extends Mammal implements Swimmer {
    Whale(String name) {
        super(name);
    }

    @Override
    String makeSound() {
        return "wooooooo";
    }

    @Override
    public void swim() {
        System.out.println(name + " is also swimming");
    }
}
