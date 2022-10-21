import transport.Bus;
import transport.Car;
import transport.Train;
import transport.Transport;

public class Main {
    public static void main(String[] args) {
        Train martin = new Train("Ласточка", "B-901", 2011, "", "",
                301, 3500, 0, "Белорусский вокзал",
                "Mинск-Пассажирский", 11);
        System.out.println(martin);
        martin.refill();
    Train leningrad = new Train("Leningrad", "D-125", 2019, "", "Россия",
          270, 1700, 0, "Ленинградский вокзал",
            "Ленинград-Пассажирский", 8);
        System.out.println(leningrad);
        leningrad.refill();

        Bus toyota = new Bus("toyota", "safari", 1980, "red", "Japan",
                160);
        Bus cherry = new Bus("cherry", "tigo", 1999, "black", "China",
                240);
        Bus haval = new Bus("haval", "awr", 2030, "black", "China",
                120);
        System.out.println(toyota);
        toyota.refill();
        System.out.println(cherry);
        cherry.refill();
        System.out.println(haval);
        haval.refill();

    }
}