package transport;

import java.time.LocalDate;

public class Car extends Transport {


    private double engineVolume;

    private String transmission;
    private final String bodyType;
    private String registrationNumber;
    private final int numberOfSeats;
    private boolean summerTires;
    private Key key;
    private final Insurance insurance;

    public Car(String brand, String model, int productionYear, String color, String productionCountry,
               int maxSpeed, double engineVolume, String transmission, String bodyType, String registrationNumber,
               int numberOfSeats, boolean summerTires, Key key, Insurance insurance) {
        super(brand, model, productionYear, color, productionCountry, maxSpeed);
        this.engineVolume = engineVolume > 0 ? engineVolume : 1.5;
        this.transmission = ValidationUtils.validOrDefault(transmission, "default");
        this.bodyType = ValidationUtils.validOrDefault(bodyType, "default");
        this.registrationNumber = ValidationUtils.validOrDefault(registrationNumber, "x000хх000");
        if (numberOfSeats == 0) {
            this.numberOfSeats = 3;
        } else {
            this.numberOfSeats = numberOfSeats;
        }
        this.summerTires = true;
        if (key == null) {
            this.key = new Key();
        } else
            this.key = key;
        if (insurance == null) {
            this.insurance = new Insurance();
        } else
            this.insurance = insurance;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public String getTransmission() {
        return transmission;
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public boolean isSummerTires() {
        return summerTires;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public void setTransmission(String transmission) {
        if (transmission == null) {
            this.transmission = "default";
        } else {
            this.transmission = transmission;
        }
    }

    public boolean correctNumber() {
        if (registrationNumber.length() != 9) {
            return false;
        }
        char[] chars = registrationNumber.toCharArray();
        if (!Character.isAlphabetic(chars[0]) || !Character.isAlphabetic(chars[4]) || !Character.isAlphabetic(chars[5])) {
            return false;
        }
        if (!Character.isDigit(chars[1]) || !Character.isDigit(chars[2]) || !Character.isDigit(chars[3]) ||
                !Character.isDigit(chars[6]) || !Character.isDigit(chars[7]) || !Character.isDigit(chars[8])) {
            return false;
        }
        return true;
    }

    public void setRegistrationNumber(String registrationNumber) {
        if (registrationNumber == null || !correctNumber()) {
            this.registrationNumber = "x000хх000";
        } else {
            this.registrationNumber = registrationNumber;
        }
    }

    public void setSummerTires(boolean summerTires) {
        this.summerTires = summerTires;
    }

    public boolean changeTires() {
        summerTires = !summerTires;
        return summerTires;
    }

    @Override
    public void refill() {
        System.out.println(brand + " можно заправлять бензином, дизелем на заправке или заряжать" +
                " на специальных электропарковках, если это электрокар.");

    }

    @Override
    public String toString() {
        return "Car{" + super.toString()+
                "engineVolume=" + engineVolume +
                ", transmission='" + transmission + '\'' +
                ", bodyType='" + bodyType + '\'' +
                ", registrationNumber='" + registrationNumber + '\'' +
                ", numberOfSeats=" + numberOfSeats +
                ", summerTires=" + summerTires +
                ", key=" + key +
                ", insurance=" + insurance +
                '}';
    }

    public static class Insurance {
        private final LocalDate validity;
        private final float price;
        private final String number;


        public Insurance(LocalDate validity, int price, String number) {
            if (validity == null) {
                this.validity = LocalDate.now().plusDays(365);
            } else {
                this.validity = validity;
            }
            this.price = Math.max(price, 1f);
            this.number = ValidationUtils.validOrDefault(number, "default");
        }

        public Insurance() {
            this(null, 0, null);
        }

        public LocalDate getValidity() {
            return validity;
        }

        public float getPrice() {
            return price;
        }

        public String getNumber() {
            return number;
        }

        public void verifyValidity() {
            if (validity.isBefore(LocalDate.now()) || validity.isEqual(LocalDate.now())) {
                System.out.println("нужно срочно ехать оформлять новую страховку.");
            }
        }

        public void verifynumber() {
            if (number.length() != 9) {
                System.out.println("Номер страховки некорректный");
            }
        }

        @Override
        public String toString() {
            return "Insurance{" +
                    "validity=" + validity +
                    ", price=" + price +
                    ", number='" + number + '\'' +
                    '}';
        }
    }

    public static class Key {
        private boolean remoteEnginestart;
        private boolean keylessEntry;

        public Key() {
            this(false, false);
        }

        public Key(boolean remoteEnginestart, boolean keylessEntry) {
            this.remoteEnginestart = remoteEnginestart;
            this.keylessEntry = keylessEntry;

        }

        public boolean isRemoteEnginestart() {
            return remoteEnginestart;
        }

        public void setRemoteEnginestart(boolean remoteEnginestart) {
            this.remoteEnginestart = remoteEnginestart;
        }

        public boolean isKeylessEntry() {
            return keylessEntry;
        }

        public void setKeylessEntry(boolean keylessEntry) {
            this.keylessEntry = keylessEntry;
        }

        @Override
        public String toString() {
            return "Key{" +
                    "remoteEnginestart=" + remoteEnginestart +
                    ", keylessEntry=" + keylessEntry +
                    '}';
        }
    }
}
