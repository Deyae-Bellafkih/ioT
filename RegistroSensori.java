public class RegistroSensori {
    private Sensore[] sensori;
    private int size;

    public RegistroSensori(int max) {
        sensori = new Sensore[max];
        size = 0;
    }

    public void aggiungiSensore(Sensore s) {
        if (size < sensori.length) {
            sensori[size++] = s;
        } else {
            System.out.println("Impossibile aggiungere un sensore");
        }
    }

    public boolean eliminaSensore(String ip) {
        for (int i = 0; i < size; i++) {
            if (sensori[i].getIP().equals(ip)) {
                sensori[i] = sensori[size - 1];
                sensori[size - 1] = null;
                size--;
                return true;
            }
        }
        return false;
    }

    public Sensore cercaIP(String ip) {
        for (int i = 0; i < size; i++) {
            if (sensori[i].getIP().equals(ip)) {
                return sensori[i];
            }
        }
        return null;
    }

    public Sensore[] cercaArea(double latitudineMax, double longitudineMax, double latitudineMin, double longitudineMin) {
        Sensore[] identificati = new Sensore[size];
        int count = 0;
        for (int i = 0; i < size; i++) {
            Sensore s = sensori[i];
            if (s.getLatitudine() >= latitudineMin && s.getLatitudine() <= latitudineMax && s.getLongitudine() >= longitudineMin && s.getLongitudine() <= longitudineMax) {
                identificati[count++] = s;
            }
        }
        return identificati;
    }

    public Sensore[] batterieScadute() {
        Sensore[] identificati = new Sensore[size];
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (sensori[i].batteriadaSostituire()) {
                identificati[count++] = sensori[i];
            }
        }
        return identificati;
    }
}


