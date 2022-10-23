package animals;

import java.util.Objects;

class Flying extends Birds{
    private String movementType;

    public static void fly(){
        System.out.println("Я могу летать");
    }

    public Flying(String name, int year, String livingEnvironment, String movementType) {
        super(name, year, livingEnvironment);
        this.movementType = ValidationUtils.validOrDefault(movementType, "летаю");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Flying flying = (Flying) o;
        return Objects.equals(movementType, flying.movementType);
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
                "Flying{" +
                "movementType='" + movementType + '\'' +
                '}';
    }
}
