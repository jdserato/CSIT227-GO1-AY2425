package Apr02;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\User\\Documents\\example.txt"));
            String s;
            while ((s = br.readLine()) != null) {
                System.out.println(s);
//                sc.nextLine();
            }
            br.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Failed to read");
        }

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("src/Apr02/vince2.txt"));
        } catch (IOException e) {
            System.out.println("Error while writing " + e.getClass());
        }
    }
}
