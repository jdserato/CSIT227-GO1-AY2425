package AAnother;

import Jan22.Student;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Vince");
        names.add("Cathy");
        names.add("Leah");
        names.add("Von");
        names.add("Khai");
        names.add("Jefferson");
        names.add("Frederick");
        names.add("Cherry Lyn");
        names.add("Patrick");
        names.add("Erica");
        names.add("Joey");
        names.add("Roden");
        names.add("Judy");
        names.add("Therese");
        for (String s : names) {
            System.out.println(s);
        }
        Collections.sort(names);
        System.out.println("AFTER SORTING");
        for (String s : names) {
            System.out.println(s);
        }
    }
}
