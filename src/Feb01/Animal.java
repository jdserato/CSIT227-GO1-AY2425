package Feb01;

import java.util.Comparator;

public abstract class Animal implements Comparable<Animal> {
    public String name;
    private int age;
    // CONSTRUCTOR
    Animal(String name) {
        this.name = name;
        this.age = (int) (Math.random()*100);
    }

    abstract String makeSound();

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        }
    }

    public int getAge() {
        return age;
    }
    // METHOD
    @Override
    public String toString() {
        return name + " [" + age + "]";
    }

    @Override
    public int compareTo(Animal o) {
        return name.compareTo(o.name);
    }

    public static class AnimalAgeComparator implements Comparator<Animal> {
        @Override
        public int compare(Animal o1, Animal o2) {
            return Integer.compare(o1.age, o2.age);
        }
    }
}
