package HW243.NumCompare;
/*
    В программу через аргументы командной строки передаются три целых числа: a, b, c.
    Выведите наибольшее из данных чисел, (программа должна вывести ровно одно целое число).
Проверку на наличие аргументов делать не надо.
 */
public class Main {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        int maxValue = a; // переменная, содержащая максимальное значение

        if (b>maxValue) {maxValue = b;}
        if (c>maxValue) {maxValue = c;}

        System.out.println("Наибольшее число: " + maxValue);

    }
}
