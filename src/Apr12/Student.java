package Apr12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Student {
    String name;
    String gender;
    String program;
    List<String> languages;

    public Student(String name) {
        this.name = name;
        languages = new ArrayList<>();
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public void addLanguage(String language) {
        languages.add(language);
    }

    public void removeLanguage(String language) {
        languages.remove(language);
    }

    @Override
    public String toString() {
        return name + " gender: " + gender +
                " program: " + program +
                "languages: " + Arrays.toString(languages.toArray());
    }
}
