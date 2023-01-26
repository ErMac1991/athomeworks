package CarsNDetails.ru.pflb.vehicles;

import CarsNDetails.ru.pflb.details.Engine;
import CarsNDetails.ru.pflb.professions.Driver;

public class Car {
    String model;
    VehicleClass vehicleClass;
    int weight;
    Driver driver;
    Engine engine;

    public Car(String model, VehicleClass vehicleClass, int weight, Driver driver, Engine engine) {
        this.model = model;
        this.vehicleClass = vehicleClass;
        this.weight = weight;
        this.driver = driver;
        this.engine = engine;
    }

    void start() {
        System.out.println("Поехали");
    }

    void stop() {
        System.out.println("Останавливаемся");
    }

    void turnRight() {
        System.out.println("Поворот направо");
    }

    void turnLeft() {
        System.out.println("Поворот налево");
    }

    public String toString() {
        String var10000 = this.model;
        return "Модель: " + var10000 + ", класс: " + this.vehicleClass + "\nХарактеристики:\n вес: " + this.weight + " кг.\n двигатель: " + this.engine.toString() + "\nВодитель: " + this.driver.toString();
    }
}