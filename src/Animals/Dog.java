package Animals;

public class Dog extends Animal { //наследуют Animal и переопределяют методы makeSound, eat, toString.

    String food = "Pedigree";
    int counter = 3;

    Dog(String name, int foodCounter, String location, HealthState health){
        super.name = name;
        super.foodCounter = foodCounter;
        super.location = location;
        super.health = health;

    }

    @Override
    void makeSound(){
        System.out.println("" + name + " говорит: Гав!"); // выводит текст, как звучит животное
    }

    @Override
    void eat(){ // выводит текст, что животное ест, уменьшает кол-во еды у животного, также выводит сколько запасов осталось
        --foodCounter;
        System.out.println("" + name + " ест " + food); // выводит текст, что животное ест
        System.out.println("Осталось " + foodCounter + " пачек.\n");
    }

    @Override
    void sleep(){
        System.out.println("" + name + " спит."); // выводит текст, как звучит спит
    }

    @Override
    public String toString(){ //вовзращает в виде строки текущую информацию об особи. Формат вывода: <Кличка>, Страна обитания: ...
        // Состояние здоровья: ... ,  Сколько особей: .
        return ("<" + name + ">\n" +
                "Страна обитания: " + location + "\n" +
                "Состояние здоровья: " + health.healthStat + "\n" +
                "Сколько особей: " + counter + "\n");

    }
}
