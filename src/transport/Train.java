package transport;

public class Train extends Transport {
   private float priceTrip;
    private int timeTrip;
    private String departureStation;
    private String endingStation;
    private int numberOfWagons;

    public Train(String brand, String model, int productionYear, String color, String productionCountry, int maxSpeed,
                 float priceTrip, int timeTrip, String departureStation, String endingStation, int numberOfWagons) {
        super(brand, model, productionYear, color, productionCountry, maxSpeed);
        setPriceTrip(priceTrip);
    setTimeTrip(timeTrip);
    setDepartureStation(departureStation);
    setEndingStation(endingStation);
    setNumberOfWagons(numberOfWagons);
    }

    public float getPriceTrip() {
        return priceTrip;
    }

    public void setPriceTrip(float priceTrip) {
        this.priceTrip = priceTrip>0? priceTrip : 100f ;
    }

    public int getTimeTrip() {
        return timeTrip;
    }

    public void setTimeTrip(int timeTrip) {
        this.timeTrip = timeTrip>0? timeTrip : 100;
    }


    public String getDepartureStation() {
        return departureStation;
    }

    public void setDepartureStation(String departureStation) {
        this.departureStation = ValidationUtils.validOrDefault(departureStation, " default");
    }

    public String getEndingStation() {
        return endingStation;
    }

    public void setEndingStation(String endingStation) {
        this.endingStation = ValidationUtils.validOrDefault(endingStation, " default");
    }

    public int getNumberOfWagons() {
        return numberOfWagons;
    }

    public void setNumberOfWagons(int numberOfWagons) {
        this.numberOfWagons = Math.max(numberOfWagons, 1);
    }

    @Override
    public String toString() {
        return "Train{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", productionYear=" + productionYear +
                ", color='" + color + '\'' +
                ", productionCountry='" + productionCountry + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", priceTrip=" + priceTrip +
                ", timeTrip='" + timeTrip + '\'' +
                ", departureStation='" + departureStation + '\'' +
                ", endingStation='" + endingStation + '\'' +
                ", numberOfWagons=" + numberOfWagons +
                '}';
    }

    @Override
    public void refill() {
        System.out.println(brand+ " нужно заправлять дизелем.");
    }

}

