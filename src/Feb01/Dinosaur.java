package Feb01;

public class Dinosaur extends Animal implements EggLayer{
    Dinosaur(String name) {
        super(name);
    }

    @Override
    String makeSound() {
        return "RAWRRR";
    }

    @Override
    public String toString() {
        return super.toString() + " is a dinosaur";
    }

    @Override
    public EGG_TYPE egg_type() {
        return EGG_TYPE.HARD;
    }
}
