package Feb01;

public class Fish extends Animal implements Swimmer, EggLayer{
    Fish(String name) {
        super(name);
    }

    @Override
    String makeSound() {
        return "bloop";
    }

    @Override
    public EGG_TYPE egg_type() {
        return EGG_TYPE.SOFT;
    }
}
