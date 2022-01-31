package mateuszkorpusik;

import java.util.ArrayList;
import java.time.*;

public class Main {

    public static void main(String[] args) {
        ArrayList<Student> student = new ArrayList<>();
        Student s1 = new Student("Patryk", LocalDate.of(1999,01,11),3.0);
        Student s2 = new Student("Adam", LocalDate.of(1999,01,11),3.5);
        Student s3 = new Student("Ewa", LocalDate.of(1998,02,24),3.5);
        Student s4 = new Student("Ewa", LocalDate.of(2005, 10, 11),5.0);

        student.add(s1);
        student.add(s2);
        student.add(s3);
        student.add(s4);

        student.sort(Student::compareTo);
        for (int i=0;i<student.size();i++){
            System.out.println(student.get(i).getNazwa());
        }

        System.out.println(KwotaStypendium());
    }
    public static double KwotaStypendium(){
        ArrayList<Student> students = new ArrayList<>();
        Student s1 = new Student("Patryk", LocalDate.of(1999,01,11),3.0);
        Student s2 = new Student("Adam", LocalDate.of(1999,01,11),3.5);
        Student s3 = new Student("Ewa", LocalDate.of(1998,02,24),3.5);
        Student s4 = new Student("Ewa", LocalDate.of(2005, 10, 11),5.0);
        int year=0;
        double note=0;
        for (int i=0;i<students.size();i++){
            year=students.get(i).getDataUrodziny().getYear();
            if (year>=2005){
                note=students.get(i).getOcena();
                if (note==5){
                    return Stypendium.kwotaStypendium;
                }

            }
        }
        return 0;
    }
}