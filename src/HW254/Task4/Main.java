package HW254.Task4;
/*
Через аргумент командной строки передается строка.
Используя StringBuilder, напишите программу, которая в переданной строке удаляет из неё всё, кроме цифр.
Выведите результирующую строку.
1)
Пример аргумента: 01a10vt0101c
Вывод: 01100101
2)
Пример аргумента: avtc
Вывод:
Проверку на наличие и корректность аргумента делать не надо.
 */
public class Main {
    public static void main(String[] args) {
        StringBuilder string = new StringBuilder(args[0]);
        String result = "";
        for (int i = 0; i < string.length(); i++) {
            if (Character.isDigit(string.charAt(i))){
                result += string.charAt(i);
            }
        }
        System.out.println(result);
    }
}