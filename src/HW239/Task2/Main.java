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
        // создаем экземпляр класса Summa
        Summa summ1 = new Summa(37, 172, 3701,50.881, 270.04, 66.817, 1538,48919);


        System.out.println("Сумма двух интов в инте: " + summ1.sum(summ1.a, summ1.b));
        System.out.println("Сумма трех интов в дабле: " + summ1.sum(summ1.a, summ1.b, summ1.c));
        System.out.println("Сумма двух интов и трех даблов в дабле: " + summ1.sum(summ1.a, summ1.b, summ1.x, summ1.y, summ1.z));
        System.out.println("Сумма одного инта и двух даблов в дабле: " + summ1.sum( summ1.b, summ1.x, summ1.z));
        System.out.println("Сумма двух интов в дабле: " + (double)summ1.sum(summ1.a, summ1.b));
        System.out.println("Сумма двух интеджеров в дабле: " + summ1.sum(summ1.integerOne, summ1.integerTwo));
    }
}
