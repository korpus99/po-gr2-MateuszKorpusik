package mateuszkorpusik;

import java.util.ArrayList;
import java.time.*;

import static mateuszkorpusik.Student.KwotaStypendium;

public class Main {

    public static void main(String[] args) {
        LocalDate d1 = LocalDate.of(2021, 01, 22);
        LocalDate d2 = LocalDate.of(2021, 01, 22);
        LocalDate d3 = LocalDate.of(2020, 11, 18);
        LocalDate d4 = LocalDate.of(2005, 10, 11);
        double o1 = 3.0;
        double o2 = 3.5;
        double o3 = 3.5;
        double o4 = 5.0;
        String n1 = "Patryk";
        String n2 = "Adam";
        String n3 = "Ewa";
        String n4 = "Ewa";

        Student s1 = new Student(n1, d1, o1);
        Student s2 = new Student(n2, d2, o2);
        Student s3 = new Student(n3, d3, o3);
        Student s4 = new Student(n4, d4, o4);

        ArrayList<Student> student = new ArrayList<Student>();
        student.add(s1);
        student.add(s2);
        student.add(s3);
        student.add(s4);

        System.out.println(student);
    }
}