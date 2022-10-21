package transport;

import java.time.LocalDate;

public abstract class Transport {

    protected final String brand;
    protected final String model;
    protected final int productionYear;
    protected String color;
    protected final String productionCountry;
    protected int maxSpeed;

    public Transport(String brand, String model, int productionYear, String color, String productionCountry, int maxSpeed) {
        this.brand = ValidationUtils.validOrDefault(brand, "default");
        this.model = ValidationUtils.validOrDefault(model, "default");
        this.productionYear = productionYear>0 && productionYear< LocalDate.now().getYear() ? productionYear : 2000;
        setColor(color);
        this.productionCountry = ValidationUtils.validOrDefault(productionCountry, "default");;
        setMaxSpeed(maxSpeed);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = ValidationUtils.validOrDefault(color, "white");
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed= maxSpeed>0? maxSpeed : 100 ;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    @Override
    public String toString() {
        return "Transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", productionYear=" + productionYear +
                ", color='" + color + '\'' +
                ", productionCountry='" + productionCountry + '\'' +
                ", maxSpeed=" + maxSpeed +
                '}';
    }

    public abstract void refill();
}
