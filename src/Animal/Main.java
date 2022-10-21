package Animal;

public class Main {
    public static void main(String[] args) {
        Herbivores gazelle = new Herbivores("gazelle", 10, "Forest", 12, "Трава");
        Herbivores giraffe = new Herbivores("giraffe", 15, "Forest", 1, "Трава");
        Herbivores horse = new Herbivores("horse", 5, "Stable", 1, "Трава");
        Predators hyena = new Predators("hyena", 5, "", 100, "Питаюсь мясом");
        Predators tiger = new Predators("tiger", 1, "Forest", 81, "Питаюсь мясом");
        Predators bear = new Predators("bear", 19, "Forest", 5, "Питаюсь мясом и медом");
        Amphibians frog = new Amphibians("frog", 19, "swamp");
        Amphibians freshwaterSnake = new Amphibians("freshwaterSnake", 19, "");
        NotFlying peacock = new NotFlying("peacock", 10, "", "не летаю, а хожу");
        NotFlying penguin = new NotFlying("penguin", 1, "", "не летаю, а хожу");
        NotFlying dodo = new NotFlying("dodo", 11, "trees", "не летаю, а хожу");
        Flying gull = new Flying("gull", 11, "sea", "Летает");
        Flying albatross = new Flying("albatross", 3, "sea", "Летает");
        Flying falcon = new Flying("falcon", 7, "", "Летает");
        System.out.println(gazelle);
        System.out.println(giraffe);
        System.out.println(horse);
        System.out.println(hyena);
        System.out.println(tiger);
        System.out.println(bear);
        System.out.println(frog);
        System.out.println(freshwaterSnake);
        System.out.println(peacock);
        System.out.println(penguin);
        System.out.println(dodo);
        System.out.println(gull);
        System.out.println(albatross);
        System.out.println(falcon);
        System.out.println(gazelle.equals(giraffe));

    }
}
