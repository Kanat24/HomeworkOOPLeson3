package animals;

import java.util.Objects;

class NotFlying extends Birds {
    private final String movementType;

    public static void stroll(){
        System.out.println("Я могу гулять");
    }

    public NotFlying(String name, int year, String livingEnvironment, String movementType) {
        super(name, year, livingEnvironment);
        this.movementType = ValidationUtils.validOrDefault(movementType, "хожу пешком");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        NotFlying notFlying = (NotFlying) o;
        return Objects.equals(movementType, notFlying.movementType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), movementType);
    }

    @Override
    public String toString() {
        return "Animals{" +
                "name='" + getName() + '\'' +
                ", year=" + getYear() +
                '}'+
                "Birds{" +
                "livingEnvironment='" + getLivingEnvironment() + '\'' +
                '}'+
                "NotFlying{" +
                "movementType='" + movementType + '\'' +
                '}';
    }
}
