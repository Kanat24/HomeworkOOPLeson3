package animals;

import java.util.Objects;

abstract class Birds extends Animal {
    private String livingEnvironment;

    public Birds(String name, int year, String livingEnvironment) {
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
                "Birds{" +
                "livingEnvironment='" + livingEnvironment + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Birds birds = (Birds) o;
        return Objects.equals(livingEnvironment, birds.livingEnvironment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), livingEnvironment);
    }
}
