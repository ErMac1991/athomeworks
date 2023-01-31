package HW239.Task2;

/*
Создать класс Summa, в нем 3 переменные int a,b,c, double x, y, z
Создать и перегрузить метод sum

- возвращающий сумму int от 2х переменных int
- возвращающий сумму double от 3х переменных int
- возвращающий сумму double от 2х и от 3х переменных double
- возвращающий сумму double от 1 int и от 2х переменных double

Значение вызова каждого метода вывести на экран в main
Попробовать создать метод возвращающий double из 2х переменных int
Попробовать создать метод возвращающий double из 2х переменных Integer
 */
public class Main {
    public static void main(String[] args) {

        int a = 48, b = 7;
        double x = 4.278, y = 19.66, z = 61.1;
        Integer integerOne = 22;
        Integer integerTwo = 333;

        System.out.println("Сумма int от 2х переменных int: " + Summa.sum(a, b));
        System.out.println("Сумма double от 3х переменных int: " + Summa.sum(a, b, b));
        System.out.println("Сумма double от 2х и от 3х переменных double: " + Summa.sum(a, b, x, y, z));
        System.out.println("Сумма double от 1 int и от 2х переменных double: " + Summa.sum( b, x, z));
        System.out.println("Сумма double из 2х переменных типа Integer: " + Summa.sum(integerOne, integerTwo));
    }
}
