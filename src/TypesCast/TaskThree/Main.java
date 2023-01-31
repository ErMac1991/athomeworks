package TypesCast.TaskThree;
/*
Напишите программу, которая получает два положительных числа через программные аргументы командной строки и выводит true,
если первое из чисел нацело делится на другое. Проверку на кол-во введенных аргументов делать не надо.

Попробуйте решить задание без использования if.

Проверку на кол-во введенных аргументов делать не надо.
Выведите исходные значения и результат. Например:
      1)Дано: a = 4, b = 5
      false

      2)Дано: a = 15, b = 5
      true
 */
public class Main {
    public static void main(String[] args) {

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        boolean isDevided;

        System.out.println("Дано: a = " + a + " b = " + b); // выводим дано

        isDevided = a%b==0;

        System.out.println(isDevided); // выводим результат
    }
}
