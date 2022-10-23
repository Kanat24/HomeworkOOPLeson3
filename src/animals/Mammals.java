package animals;

import java.util.Objects;

abstract class Mammals extends Animal {
    private  String livingEnvironment;
    private int speed;

    public Mammals(String name, int year, String livingEnvironment, int speed) {
        super(name, year);
        this.livingEnvironment = ValidationUtils.validOrDefault(livingEnvironment, "Обычная");;
        this.speed = speed>0? speed: 1;
    }

    public static void stroll(){
        System.out.println("Я гуляю");
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public int getSpeed() {
        return speed;
    }


    @Override
    public void eat() {
        System.out.println(" Я ем");
    }

    @Override
    public void go() {
        System.out.println(" Я иду");

    }

    @Override
    public String toString() {
        return "Animals{" +
                "name='" + getName() + '\'' +
                ", year=" + getYear() +
                '}'+
                "Mammals{" +
                "livingEnvironment='" + livingEnvironment + '\'' +
                ", speed=" + speed +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Mammals mammals = (Mammals) o;
        return speed == mammals.speed && Objects.equals(livingEnvironment, mammals.livingEnvironment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), livingEnvironment, speed);
    }
}
