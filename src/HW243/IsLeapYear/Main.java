package HW243.IsLeapYear;
/*
Через аргументы командной строки передается число - года (целое, положительное, не превышает 30000).
Напишите программу вычисляющую является ли данный год високосным.
Напомним, что год является високосным, если его номер кратен 4, но не кратен 100, а также если он кратен 400.
Требуется вывести слово YES, если год является високосным и NO - в противном случае.

Проверку на наличие аргументов делать не надо.
Надо проверить, что переданное число находится в заданном диапазоне.
В противном случае нужно вывести пользователю сообщение об ошибке, и завершить программу.
 */
public class Main {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);

        if (a > 0 && a < 30001) {

            if ((a % 400 == 0)||(a % 4 == 0 && a % 100 != 0)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }

        }
        else {
            System.out.println("Переданное число находится вне диапазона 1-30000");
        }
    }
}