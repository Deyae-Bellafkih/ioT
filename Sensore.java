import java.util.Calendar;

public class Sensore {

    private String ip;
    private Coordinate coordinate;
    private Calendar dataUltimaSostituzione;

    public Sensore(String ip, Coordinate coordinate, Calendar dataUltimaSostituzione) {
        this.ip = ip;
        this.coordinate = coordinate;
        this.dataUltimaSostituzione = dataUltimaSostituzione;
    }

    public String getIP() {
        return ip;
    }

    public Coordinate getCoordinate() {
        return coordinate;
    }

    public Calendar getDataUltimaSostituzione() {
        return dataUltimaSostituzione;
    }

    public boolean batteriadaSostituire() {
        long diffMillis = Calendar.getInstance().getTimeInMillis() - dataUltimaSostituzione.getTimeInMillis();
        long diffGiorni = diffMillis / (1000 * 60 * 60 * 24);
        if (diffGiorni > 365) {
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        return "Sensore[" + ip + ", coordinate: " + coordinate + "]";
    }
}



