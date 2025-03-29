package Mar19;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] names = {"Carl", "Joshua", "Joseph", "Whitey"};
        Scanner sc = new Scanner(System.in);
        String name = null;
        while (true) {
            try {
                System.out.print("Enter an index (0-3): ");
                int index = sc.nextInt();
                name = names[index];
                break;
            } catch (InputMismatchException e) {
                sc.next();
                System.out.println("Invalid input");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Cannot use that index");
            }
        }

        while (true) {
            try {
                System.out.print("Enter an age: ");
                int age = sc.nextInt();
                Person vince = new Person(name, age);
                System.out.println(vince);
                break;
            } catch (InputMismatchException e) {
                sc.next();
                System.out.println("Invalid input");
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
//                i
            }
        }
    }
}
