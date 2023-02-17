package javaoop.exercises._1;

import java.util.ArrayList;

public class Course {
    String courseName;
    int maxStudents;
    short qualityRatingOutOf10;
    ArrayList<Student> student = new ArrayList<>();
    int age;
    String name;
    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", maxStudents=" + maxStudents +
                ", qualityRatingOutOf10=" + qualityRatingOutOf10 +
                ", student=" + student +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}

