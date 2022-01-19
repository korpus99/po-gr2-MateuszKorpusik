import java.time.*;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        LocalDate d1 = LocalDate.of(2021, 01, 22);
        LocalDate d2 = LocalDate.of(2020, 11, 18);
		LocalDate d3 = LocalDate.of(2020, 11, 18);
		LocalDate d4 = LocalDate.of(2019, 10, 11);
        double r1 = 300.00;
        double r2 = 25.99;
		double r3 = 205.99;
		double r4 = 215.99;
        String n1 = "Patryk";
        String n2 = "Adam";
		String n3 = "Ania";
		String n4 = "Ewa";

        Klient k1 = new Klient(n1, d1, r1);
        Klient k2 = new Klient(n2, d2, r2);
        Klient k3 = new Klient(n3, d3, r3);
        Klient k4 = new Klient(n4, d4, r4);

        ArrayList<Klient> klienci = new ArrayList<Klient>();
        klienci.add(k1);
        klienci.add(k2);
        klienci.add(k3);
        klienci.add(k4);

        ObslugaKlienta ob = new ObslugaKlienta(klienci);
        ob.setProcentRabatu();
        System.out.println(ob);
        System.out.println(ob.discountAmount(k1));
    }

    public static ArrayList<Klient> DiscountMap(ArrayList<Klient> klist){
        HashMap<String, String> mapa = new HashMap<String, String>();
    }
}