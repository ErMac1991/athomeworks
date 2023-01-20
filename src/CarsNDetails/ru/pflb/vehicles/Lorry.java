package CarsNDetails.ru.pflb.vehicles;

import CarsNDetails.ru.pflb.details.Engine;
import CarsNDetails.ru.pflb.professions.Driver;

public class Lorry extends Car {
    int loadingAmount;

    public Lorry(String model, VehicleClass vehicleClass, int weight, int loadingAmount, Driver driver, Engine engine) {
        super(model, vehicleClass, weight, driver, engine);
        super.model = model;
        super.vehicleClass = vehicleClass;
        super.weight = weight;
        super.driver = driver;
        super.engine = engine;
        this.loadingAmount = loadingAmount;
    }

    public String toString() {
        String var10000 = this.model;
        return "Модель: " + var10000 + ", класс: " + this.vehicleClass + "\nХарактеристики:\n вес: " + this.weight + " кг.\n двигатель: " + this.engine.toString() + "\n грузоподъемность: " + this.loadingAmount + " кг.\nВодитель: " + this.driver.toString();
    }
}