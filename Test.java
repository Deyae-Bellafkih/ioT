import java.util.Arrays;
import java.util.GregorianCalendar;

public class Test {
    public static void main(String[] args) {
        RegistroSensori registro = new RegistroSensori(8);
        Sensore s1 = new Sensore("192.168.100.20", new Coordinate(45.3,35.7), new GregorianCalendar(2024, GregorianCalendar.APRIL, 18));
        Sensore s2 = new Sensore("192.168.100.30", new Coordinate(48.2,36.2), new GregorianCalendar(2020, GregorianCalendar.AUGUST, 7));
        Sensore s3 = new Sensore("192.168.100.40", new Coordinate(45.6,36.7), new GregorianCalendar(2024, GregorianCalendar.SEPTEMBER, 29));
        Sensore s4 = new Sensore("192.168.100.50", new Coordinate(46.1,35.9), new GregorianCalendar(2023, GregorianCalendar.MAY, 23));
        Sensore s5 = new Sensore("192.168.100.60", new Coordinate(45.1,36.7), new GregorianCalendar(2025, GregorianCalendar.MARCH, 28));

        if (registro.aggiungiSensore(s1)) {
            System.out.println("Sensore aggiunto correttamente: " + s1.getIP());
        } else {
            System.out.println("Impossibile aggiungere il sensore: " +s1.getIP());
        }

        if (registro.aggiungiSensore(s1)) {
            System.out.println("Sensore aggiunto correttamente: " + s2.getIP());
        } else {
            System.out.println("Impossibile aggiungere il sensore: " +s2.getIP());
        }

        if (registro.aggiungiSensore(s1)) {
            System.out.println("Sensore aggiunto correttamente: " + s3.getIP());
        } else {
            System.out.println("Impossibile aggiungere il sensore: " +s3.getIP());
        }

        if (registro.aggiungiSensore(s1)) {
            System.out.println("Sensore aggiunto correttamente: " + s4.getIP());
        } else {
            System.out.println("Impossibile aggiungere il sensore: " +s4.getIP());
        }

        if (registro.aggiungiSensore(s1)) {
            System.out.println("Sensore aggiunto correttamente: " + s5.getIP());
        } else {
            System.out.println("Impossibile aggiungere il sensore: " +s5.getIP());
        }

        registro.aggiungiSensore(s1);
        registro.aggiungiSensore(s2);
        registro.aggiungiSensore(s3);
        registro.aggiungiSensore(s4);
        registro.aggiungiSensore(s5);

        System.out.println("Ecco i sensori con la batteria scaduta");
        System.out.println(Arrays.toString(registro.batterieScadute()));

        System.out.println("Cerca i sensori in un'area");
        Sensore[] sensoriInArea = (registro.cercaArea(45.7, 37.5, 45.0, 36.5 ));
        for (Sensore s : sensoriInArea) {
            System.out.println(s);
        }

        System.out.println("Cerca in base all'ip");
        System.out.println(registro.cercaIP("192.168.100.50"));


        System.out.println("Sensore eliminato");
        if (registro.eliminaSensore("192.169.100.50") == true) {
            System.out.println("Il sensore è stato eliminato");
        } else {
            System.out.println("Impossibile eliminare il sensore");
        }


    }
}