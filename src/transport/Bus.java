package transport;
public class Bus extends Transport {


    public Bus(String brand, String model, int productionYear, String color, String productionCountry, int maxSpeed) {
        super(brand, model, productionYear, color, productionCountry, maxSpeed);

    }
    @Override
    public String toString() {
        return "Bus{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", productionYear=" + productionYear +
                ", color='" + color + '\'' +
                ", productionCountry='" + productionCountry + '\'' +
                ", maxSpeed=" + maxSpeed +
                '}';
    }

    @Override
    public void refill() {
        System.out.println(brand+ " можно заправлять бензином или дизелем на заправке.");
    }
}
