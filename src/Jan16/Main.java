package Jan16;//import java.util.Scanner;
//
//public class Jan16.Main {
//
//
//    public enum MONTH {January, February, March, April, May}
//
//    public static void main(String[] args) {
//        MONTH birthmonth = MONTH.April;
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter name: ");
//        String name = sc.nextLine();
//        int age = 0x2a;
//        double money = 12.95;
//        int kwarta = (int) money;
//        double pera = kwarta;
//        boolean happy = true;
//        System.out.printf("%s age: %x\n", name, age);
//        System.out.println(birthmonth);
//        int[] arr = {2, 4, 6, 8, 10, 12, 14};
//        int[] arr2 = {1, 3, 5};
//        System.out.println("Answer is " + addNumbers(4,5));
//        for (int i : arr) {
//            for (int j = 0; j < arr2.length; j++) {
//                System.out.print(arr2[j] + " ");
//            }
//            System.out.print(i + " ");
//        }
//    }
//
//    public static int addNumbers(int a, int b) {
//        return a + b;
//    }
//}
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        System.out.print("Enter your city: ");
        String city = sc.next();
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("City: " + city);

    }
}