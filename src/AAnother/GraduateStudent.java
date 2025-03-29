package AAnother;

import Jan22.Student;

public class GraduateStudent extends Student {
    public GraduateStudent(String name, String id) {
        super(name, id);
    }

    @Override
    public boolean enroll(String course) {
        return false;
    }

    void promote() {
        yearLevel = 2;
    }
}
