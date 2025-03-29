package Mar19;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) throws Exception {
        if (age < 0) {
            throw new Exception("Age cannot be negative");
        }
        this.age = age;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}
