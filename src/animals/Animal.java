package animals;

import java.util.Objects;

abstract class Animal {
    private String name;
    private int year;

    public abstract void eat();

    public static void sleep() {
        System.out.println(" Я сплю");
    }

    public abstract void go();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = ValidationUtils.validOrDefault(name, "animals");
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year > 0 ? year : 1;
    }

    protected Animal(String name, int year) {
        setName(name);
        setYear(year);
    }

    @Override
    public String toString() {
        return "Animals{" +
                "name='" + name + '\'' +
                ", year=" + year +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animals = (Animal) o;
        return year == animals.year && Objects.equals(name, animals.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, year);
    }
}
