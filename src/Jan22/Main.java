package Jan22;

import AAnother.GraduateStudent;

public class Main {
    public static void main(String[] args) {
        Student vince = new Student("Vince", "1767");
        vince.enroll("CSIT227");
        vince.yearLevel = 4;
        Student michael = new Student("Michael", "21-2425-256");
        System.out.println(michael.yearLevel);
        Student.school = "CIT";
        Student.school = "CIT-U";
        System.out.println(vince.getName());
        System.out.println(michael.getName());
        System.out.println(Student.school);
        System.out.println(Student.school);
        GraduateStudent jay = new GraduateStudent("Jay", "20-4003-448");
        System.out.println(jay.id);

    }
}
