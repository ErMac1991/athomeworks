package Animals;


public abstract class Animal {
    String name; // - name - кличка животного
    String food; // - food - название типа пищи
    int foodCounter; // - foodCounter - кол-во запасов пищи
    String location; // - location - название страны обитания
    int counter; // - counter - все животные имеют внутреннюю связь с сородичами, в переменной содержится общее кол-во осыбей данного вида
    HealthState health;// - health - состояние здоровья животного типа HealthState

    void makeSound(){
        System.out.println(); // выводит текст, как звучит животное
    }

    void eat(){ // выводит текст, что животное ест, уменьшает кол-во еды у животного, также выводит сколько запасов осталось
        System.out.println(); // выводит текст, что животное ест
    }

    void sleep(){
        System.out.println(); // выводит текст, как звучит спит
    }

    public String toString(){ //вовзращает в виде строки текущую информацию об особи. Формат вывода: <Кличка>, Страна обитания: ...
                                // Состояние здоровья: ... ,  Сколько особей: .
        return "";

    }

}
