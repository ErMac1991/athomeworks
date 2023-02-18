package HW247.Task3;
/*
Напишите метод snakePrint(int n, int col),
который выводит числа "змейкой" от 1 до n:
    1 2 3 4
    8 7 6 5
    9 10 11 12
    ... n
где:
n - максимальное число
col - количество цифр в одной строке
Выводимые числа разделены пробелами.
Используя реализованный метод, напишите программу, которая через
аргументы командной строки получает целочисленные значения n и col,
а затем печатает соответствующего размера змейку.
Проверку на наличие аргументов делать не надо.
Сделайте проверку, что n больше или равно 1, а m больше 0.
В противном случае выведите сообщение об ошибке
и завершите программу.
 */
public class Main {
    public static void main(String[] args) {

        int numbersLimit = Integer.parseInt(args[0]); // максимальное число
        int lineLength = Integer.parseInt(args[1]); // количество цифр в одной строке

        if (numbersLimit >= 1 && lineLength > 0){
            snakePrint(numbersLimit, lineLength);
        }
        else System.out.println("Введены некорректные значения");
    }

    public static void snakePrint(int n, int col){
        boolean evenLine = false; // указывает четный ли ряд
        int number = 1; // порядковый номер числа

        while (number <= n){
            int[] line = new int[col]; // массив линной в один ряд


            // заполняем массив числами

            for (int i = 0; i < col; i++, number++) {
                if (number > n) break;
                line[i] = number;
            }


            // в зависимости от четности ряда, применяем порядок вывода и исключаем несуществующие значения

            if (evenLine == false) {
                for (int i = 0; i < col; i++) {
                    if (line[i] !=0) System.out.print(line[i] + " ");
                }

            } else {
                for (int i = (col-1); i >=0; i--) {
                    if (line[i] !=0) System.out.print(line[i] + " ");
                }
            }

            // переходим к следующему ряду
                System.out.println();
                evenLine = !evenLine;
        }
    }
}
