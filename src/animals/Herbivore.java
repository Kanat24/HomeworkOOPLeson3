package animals;

import java.util.Objects;

class Herbivore extends  Mammals{
    private String typeOfFood;

public static void pasture(){
    System.out.println("Я могу пастись");
}

    public Herbivore(String name, int year, String livingEnvironment, int speed, String typeOfFood) {
        super(name, year, livingEnvironment, speed);
        this.typeOfFood = ValidationUtils.validOrDefault(typeOfFood, "Питаюсь травой");;
    }

    public String getTypeOfFood() {
        return typeOfFood;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Herbivore that = (Herbivore) o;
        return Objects.equals(typeOfFood, that.typeOfFood);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeOfFood);
    }

    @Override
    public String toString() {
        return "Animals{" +
                "name='" + getName() + '\'' +
                ", year=" + getYear() +
                '}'+
                "Mammals{" +
                "livingEnvironment='" + getLivingEnvironment() + '\'' +
                ", speed=" + getSpeed() +
                '}'+
                "Herbivores{" +
                "typeOfFood='" + typeOfFood + '\'' +
                '}';
    }
}
