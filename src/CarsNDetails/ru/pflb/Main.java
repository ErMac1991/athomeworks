package CarsNDetails.ru.pflb;

import CarsNDetails.ru.pflb.details.Engine;
import CarsNDetails.ru.pflb.professions.Driver;
import CarsNDetails.ru.pflb.vehicles.Car;
import CarsNDetails.ru.pflb.vehicles.Lorry;
import CarsNDetails.ru.pflb.vehicles.SportCar;
import CarsNDetails.ru.pflb.vehicles.VehicleClass;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Driver carDriver = new Driver("Сергей", 28, 8, "50 08 189924");
        Driver lorryDriver = new Driver("Петр", 51, 23, "83 17 571098");
        Driver sportCarDriver = new Driver("Франсуа", 33, 15, "71 01 285007");
        Engine carEngine = new Engine(74000, "Ricardo");
        Engine lorryEngine = new Engine(720000, "Автодизель");
        Engine sportCarEngine = new Engine(478074, "SAME Deutz Fahr");
        Car car = new Car("Ford Focus", VehicleClass.SMALL, 1385, carDriver, carEngine);
        Lorry lorry = new Lorry("KAMAZ-53212", VehicleClass.LARGE, 8200, 10000, lorryDriver, lorryEngine);
        SportCar sportCar = new SportCar("Lamborghini Reventon", VehicleClass.SPORTS_CAR, 1665, 350, sportCarDriver, sportCarEngine);
        System.out.println(car.toString() + "\n");
        System.out.println(lorry.toString() + "\n");
        System.out.println(sportCar.toString() + "\n");
    }
}