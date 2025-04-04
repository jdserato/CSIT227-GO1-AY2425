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
            br.readLine();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Failed to read");
        }

        // try-with-resources
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("src/Apr02/vince.txt"))) {
            for (int i = 0; i <= 10_008; i++) {
                bw.write(i + "");
                bw.newLine();
            }
            return;
        } catch (IOException e) {
            System.out.println("Error while writing " + e.getClass());
        }
        System.out.println("Program has ended.");
    }
}
