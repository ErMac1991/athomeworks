package CarsNDetails.ru.pflb.vehicles;

import CarsNDetails.ru.pflb.details.Engine;
import CarsNDetails.ru.pflb.professions.Driver;

public class SportCar extends Car {
    int maxVelocity;

    public SportCar(String model, VehicleClass vehicleClass, int weight, int maxVelocity, Driver driver, Engine engine) {
        super(model, vehicleClass, weight, driver, engine);
        super.model = model;
        super.vehicleClass = vehicleClass;
        super.weight = weight;
        super.driver = driver;
        super.engine = engine;
        this.maxVelocity = maxVelocity;
    }

    public String toString() {
        String var10000 = this.model;
        return "Модель: " + var10000 + ", класс: " + this.vehicleClass + "\nХарактеристики:\n вес: " + this.weight + " кг.\n двигатель: " + this.engine.toString() + "\n максимальная скорость: " + this.maxVelocity + " км/ч.\nВодитель: " + this.driver.toString();
    }
}
