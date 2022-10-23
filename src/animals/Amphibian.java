package animals;

import java.util.Objects;

 class Amphibian extends Animal {
    private String livingEnvironment;

    public Amphibian(String name, int year, String livingEnvironment) {
        super(name, year);
        this.livingEnvironment = ValidationUtils.validOrDefault(livingEnvironment, "Обычная");
    }
    public static void hunt(){
        System.out.println("Я охочусь");
    }

    @Override
    public void eat() {
        System.out.println(" Я ем");
    }

    @Override
    public void go() {
        System.out.println(" Я иду");

    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    @Override
    public String toString() {
        return "Animals{" +
                "name='" + getName() + '\'' +
                ", year=" + getYear() +
                '}'+
                "Amphibians{" +
                "livingEnvironment='" + livingEnvironment + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Amphibian that = (Amphibian) o;
        return Objects.equals(livingEnvironment, that.livingEnvironment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), livingEnvironment);
    }
}
