public class Coordinate {

    private double latitudine;
    private double longitudine;

    public Coordinate(double latitudine, double longitudine) {
        this.latitudine = latitudine;
        this.longitudine = longitudine;
    }

    public double getLatitudine() {
        return latitudine = latitudine;
    }

    public double getLongitudine() {
        return longitudine;
    }

    public String toString() {
        return "Latitudine =" + latitudine + ", longitudine =" + longitudine;
    }
}
