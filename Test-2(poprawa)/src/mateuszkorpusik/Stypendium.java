package mateuszkorpusik;
import java.util.ArrayList;

public class Stypendium {
    static double kwotaStypendium;
    private ArrayList<Student> lista;

    public Stypendium(ArrayList<Student> lista){
        this.lista = lista;
    }

    public void setKwotaStypendium(){
        double nowa = 500;
        kwotaStypendium = nowa;
    }
}