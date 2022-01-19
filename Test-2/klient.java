import java.time.*;

public class Klient implements Cloneable, Comparable<Klient>{
    private String nazwa;
    private LocalDate dataZakupy;
    private double rachunek;

    public Klient(String nazwa, LocalDate dataZakupy, double rachunek){
        this.nazwa = nazwa;
        this.dataZakupy = dataZakupy;
        this.rachunek = rachunek;
    }

    public String getNazwa(){
        return this.nazwa;
    }

    public LocalDate getDataZakupy(){
        return this.dataZakupy;
    }

    public double getRachunek(){
        return this.rachunek;
    }

    public int compareTo(Klient klient){
        int result = this.dataZakupy.compareTo(klient.dataZakupy);
        if(result != 0){
            return result;
        }
        if(result == 0){
            result = this.nazwa.compareTo(klient.nazwa);
            if(result != 0){
                return result;
            }
            if(result == 0){
                if (this.rachunek == klient.rachunek){
                 return 0;
                }
            }
        }
        return result;
    }

}