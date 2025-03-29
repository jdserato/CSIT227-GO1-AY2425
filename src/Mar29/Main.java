package Mar29;

import java.io.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[5];
//        System.out.print("Enter numbers: ");
//        try {
//            for (int i = 0;i < array.length; i++) {
//                array[i] = sc.nextInt();
//            }
//        } catch (InputMismatchException e) {
//            System.out.println("Invalid input. Program is terminating...");
//            return;
//        }
        try {
            FileReader fr = new FileReader("inputs.txt");
            BufferedReader br = new BufferedReader(fr);
            for (int j = 0; j < array.length; j++) {
                array[j] = Integer.parseInt(br.readLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("File is not there");
            return;
        } catch (IOException e){
            System.out.println("Error while reading");
            return;
        } catch (NumberFormatException e) {
            System.out.println("Wrong format " + e.getMessage());
            return;
        }

        int sum = 0;
        for (int n : array) {
            sum += n;
        }
        System.out.println("The sum is " + sum);
        // TODO 4
        while (true) {
            try {
                System.out.print("Provide an index: ");
                int index = sc.nextInt();
                array[index]++;
                break;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Invalid index.");
            }
        }
        // 5
        for (int n : array) {
            System.out.print(n + " ");
        }
        // TODO 6
        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new FileWriter("inputs.txt"));
            for (int n : array) { // for each int in array
                bw.write(n + "");
                bw.newLine();
            }
            ArrayList<String> list = new ArrayList<>();
            list.add("Vince");
            if (list.contains("Jay")) {

            }
        } catch (IOException e) {
            System.out.println("Error while writing");
        } finally {
            try {
                bw.close();
            } catch (IOException e) {

            }
        }
    }
}
