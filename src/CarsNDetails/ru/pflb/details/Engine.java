package CarsNDetails.ru.pflb.details;

public class Engine {
    int power;
    String vendor;

    public Engine(int power, String vendor) {
        this.power = power;
        this.vendor = vendor;
    }

    public String toString() {
        return this.vendor + " - " + this.power + " Вт.";
    }
}
