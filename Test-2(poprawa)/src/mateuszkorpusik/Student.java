package mateuszkorpusik;
import java.time.*;

public class Student implements Cloneable, Comparable<Student>{
    private String nazwa;
    private LocalDate dataUrodziny;
    private double ocena;

    public Student(String nazwa, LocalDate dataUrodziny, double ocena){
        this.nazwa = nazwa;
        this.dataUrodziny = dataUrodziny;
        this.ocena = ocena;
    }

    public String getNazwa(){
        return this.nazwa;
    }

    public LocalDate getDataUrodziny(){
        return this.dataUrodziny;
    }

    public double getOcena(){
        return this.ocena;
    }

    public String toString(String msg)
    {
        String text = msg;
        return text;
    }

    public int compareTo(Student student){
        int result = this.dataUrodziny.compareTo(student.dataUrodziny);
        if(result != 0){
            return result;
        }
        if(result == 0){
            result = this.nazwa.compareTo(student.nazwa);
            if(result != 0){
                return result;
            }
            if(result == 0){
                if (this.ocena == student.ocena){
                    return 0;
                }
            }
        }
        return result;
    }
}