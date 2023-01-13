package CarsNDetails.ru.pflb.professions;

import CarsNDetails.ru.pflb.Person;

public class Driver extends Person {
    int drivingExperience;
    String licenseId;

    public Driver(String name, int age, int drivingExperience, String licenseId) {
        super.name = name;
        super.age = age;
        this.drivingExperience = drivingExperience;
        this.licenseId = licenseId;
    }

    public String toString() {
        return "<" + this.name + "> - возраст: " + this.age + " лет\n       - стаж: " + this.drivingExperience + " лет\n       - № удостоверения: " + this.licenseId;
    }
}