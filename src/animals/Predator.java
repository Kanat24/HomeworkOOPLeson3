package animals;

import java.util.Objects;

class Predator extends Mammals{
    private String typeOfFood;

    public static void hunt(){
        System.out.println("Я могу охотиться");

    }

    public Predator(String name, int year, String livingEnvironment, int speed, String typeOfFood) {
        super(name, year, livingEnvironment, speed);
        this.typeOfFood = ValidationUtils.validOrDefault(typeOfFood, "Питаюсь мясом");
    }

    public String getTypeOfFood() {
        return typeOfFood;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Predator predators = (Predator) o;
        return Objects.equals(typeOfFood, predators.typeOfFood);
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
                "Predators{" +
                "typeOfFood='" + typeOfFood + '\'' +
                '}';
    }
}
