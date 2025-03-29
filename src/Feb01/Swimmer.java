package Feb01;

public interface Swimmer {
    int i = 0;
    public default void swim() {
        System.out.println("I am swimming");
    }
}
