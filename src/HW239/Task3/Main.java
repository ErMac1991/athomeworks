package HW239.Task3;

import static HW239.Task3.Animal.*;

public class Main {
    public static void main(String[] args) {

        testStaticMethod();  // -через статический импорт
        Cat.testStaticMethod(); // -через имя класса наследника
        Animal.testStaticMethod(); // -через имя класса родителя

    }
}        