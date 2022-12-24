package Circles;
/*
Создать класс Circle, который содержит
 - переменную radius;
 - методы, вычисляющие площадь и длину окружности;
 - константу PI.

Создать несколько объектов данного класса и вывести на экран:

радиус - площадь - длина окружности

 */
public class Main {
    public static void main(String[] args) {

        // Создаем объекты

        Circle firstCirc = new Circle(15.5);
        System.out.println("Радиус: " + Circle.radius + "; Площадь: " + firstCirc.circArea() + "; Длина окружности: " + firstCirc.circLenght());

        Circle secondCirc = new Circle(21.0);
        System.out.println("Радиус: " + Circle.radius + "; Площадь: " + secondCirc.circArea() + "; Длина окружности: " + secondCirc.circLenght());

        Circle thirdCirc = new Circle(88.8);
        System.out.println("Радиус: " + Circle.radius + "; Площадь: " + thirdCirc.circArea() + "; Длина окружности: " + thirdCirc.circLenght());

    }
}
