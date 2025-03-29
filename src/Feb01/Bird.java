package Feb01;

public class Bird extends Animal implements Flyer, EggLayer{
    Bird(String name) {
        super(name);
    }

    @Override
    String makeSound() {
        return "tweet tweet";
    }

    public void fly() {
        System.out.println(name + " is flying");
    }

    @Override
    public EGG_TYPE egg_type() {
        return EGG_TYPE.HARD;
    }
}
