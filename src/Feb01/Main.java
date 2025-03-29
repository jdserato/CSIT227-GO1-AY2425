package Feb01;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Dinosaur dino = new Dinosaur("Barney");
        Whale willy = new Whale("Willy");
        Fish nemo = new Fish("Nemo");
        Bird tweetie = new Bird("Tweetie");
        Cat marc = new Cat("Marc");
        Dog nico = new Dog("Nico");
        Penguin cyril = new Penguin("Cyril");
        Bat carl = new Bat("Carl");
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(dino);
        animals.add(willy);
        animals.add(nemo);
        animals.add(tweetie);
        animals.add(marc);
        animals.add(nico);
        animals.add(cyril);
        animals.add(carl);
        Collections.sort(animals); // COMPARABLE
        System.out.println("Sorting by Name");
        for (Animal a : animals) {
            System.out.println(a);
        }
        animals.sort(new Animal.AnimalAgeComparator()); // COMPARATOR
        System.out.println("Sorting by Age");
        for (Animal a : animals) {
            System.out.println(a);
        }
    }
}
