package Jan22;

public class Student {
    // CLASS VARIABLE
    static String school;
    // INSTANCE VARIABLES / FIELDS
    private String name;
    public int yearLevel;
    public final String id;

    // METHODS
    public Student(String name, String id) {
        this.id = id;
        this.name = name;
        yearLevel = 1;
    }
    // METHOD OVERLOADING
    public boolean enroll(String course) {
        return true;
    }
    public boolean enroll(String program, int year) {
        return true;
    }
    public boolean enroll(int age, String program) {
        return true;
    }
    //  GETTER
    public String getName() {
        return name;
    }
    // SETTER
    public void setName(String name) {
        this.name = name;
    }
}
