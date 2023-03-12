package HW258.Task2;

/*
Через аргументы командной строки передаются "слова" - последовательность строчных латинских букв и цифр.
Каждый аргумент - отдельное "слово".
Напишите программу, которая выводит слова наибольшей длины.
Сделайте проверку на наличие аргументов командной строки.
Если аргументы не переданы, то выведите соответствующее сообщение и завершите программу.
Сделайте проверку, что "слова" состоят только из строчных латинских букв и цифр.
Иначе выведите сообщение об ошибке и завершите программу.
Например:
Ввод: 123 abcd b33f 0s 12
Вывод: abcd b33f
 */
public class Main {
    public static void main(String[] args) {

        int maxLenght = 0; // длина слова наибольшей длины
        String longestWords = ""; // Строка, содержащая слова наибольшей длины

        // Проверка на наличие аргументов
        if (args.length == 0) {
            System.out.println("Аргументы не переданы");
            System.exit(0);
        }

        for (int i = 0; i < args.length; i++){

            // Проверка на содержание в аргументах символов, отличных от цифр и латинских строчных букв
            if (!args[i].matches("^[0-9a-z]*$")){
                System.out.println("Аргументы содержат символы, отличные от цифр и латинских строчных букв");
                System.exit(0);
            }

            // Определение слов наибольшей длины
            if(args[i].length() == maxLenght) {
                longestWords += args[i] + " ";
            }

            if (args[i].length() > maxLenght) {
                maxLenght = args[i].length();
                longestWords = args[i] + " ";
            }
        }

        System.out.println(longestWords);

    }
}
