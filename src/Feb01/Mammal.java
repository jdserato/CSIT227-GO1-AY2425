package Feb01;

public abstract class Mammal extends Animal {
    Mammal(String name) {
        super(name);
    }

    int provideMilk() {
        System.out.println("Providing milk");
        return 2;
    }
}
