package Cars.mapackage;
/*
Создайте класс Main в пакете mypackage и другой класс Car в пакете mypackage.cars со статическим методом move().

Вызовите статический метод из класса в пакете mypackage, используя различные возможности импорта.
Все варианты записать в текстовый файл в формате:
1- Строка импорта
   Строка вызова метода
2- Строка импорта
   Строка вызова метода
и тд.  (Должно получиться не менее 5 вариантов)
 */

import Cars.mapackage.cars.Car;
import static Cars.mapackage.cars.Car.move;

public class Main {
    public static void main(String[] args) {
        move();
        Car.move();


    }
}
