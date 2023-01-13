package Animals;

public class Main {
    public static void main(String[] args) {

        // - добавьте переменные в классов Dog, Cat, Horse
        Dog dog1 = new Dog("Брутус", 10,"США", HealthState.HEALTHY);
        Dog dog2 = new Dog("Фрэнк", 6,"Великобритания", HealthState.UNHEALTHY);
        Dog dog3 = new Dog("Хутч", 18,"Канада", HealthState.UNHEALTHY);
        Cat cat1 = new Cat("Сэлем", 11,"Болгария", HealthState.HEALTHY);
        Cat cat2 = new Cat("Бегемот", 83,"Россия", HealthState.UNHEALTHY);
        Horse horse1 = new Horse("Спирит", 22,"Монголия", HealthState.HEALTHY);
        Horse horse2 = new Horse("Юлий", 107,"Италия", HealthState.UNHEALTHY);
        Horse horse3 = new Horse("Максимус", 3,"Швеция", HealthState.HEALTHY);
        Horse horse4 = new Horse("Булзай", 7,"Мексика", HealthState.UNHEALTHY);
        Vet vet = new Vet("Айболит");

                // - выведите внутреннию информацию о каждой особи
        System.out.println(dog1.toString());
        System.out.println(dog2.toString());
        System.out.println(dog3.toString());
        System.out.println(cat1.toString());
        System.out.println(cat2.toString());
        System.out.println(horse1.toString());
        System.out.println(horse2.toString());
        System.out.println(horse3.toString());
        System.out.println(horse4.toString());
        System.out.println();

                // - выведите результат makeSound для каждой особи
        dog1.makeSound();
        dog2.makeSound();
        dog3.makeSound();
        cat1.makeSound();
        cat2.makeSound();
        horse1.makeSound();
        horse2.makeSound();
        horse3.makeSound();
        horse4.makeSound();
        System.out.println();

                // - вызовите метод eat у некоторых животных
        dog2.eat();
        cat2.eat();
        horse2.eat();
        horse3.eat();
        System.out.println();

                // - создайте ветеринара и отведите каждого животного на прием
        Vet.treatAnimal(dog1);
        Vet.treatAnimal(dog2);
        Vet.treatAnimal(dog3);
        Vet.treatAnimal(cat1);
        Vet.treatAnimal(cat2);
        Vet.treatAnimal(horse1);
        Vet.treatAnimal(horse2);
        Vet.treatAnimal(horse3);
        Vet.treatAnimal(horse4);

                // - вызовите метод sleep у некоторых животных
        dog1.sleep();
        cat1.sleep();
        horse4.sleep();
    }
}
