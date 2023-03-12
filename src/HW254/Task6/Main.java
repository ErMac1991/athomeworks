package HW254.Task6;
/*
Реализуйте метод static int toInt(String str), который принимает в качестве аргумента строковое представление целого числа
и возвращает его целочисленное значение.
Т.е. результатом вызова toInt("-14") будет целое число -14. Или toInt("0012") вернет 12.
Использовать Integer.parseInt, Integer.valueOf и подобные "готовые" методы нельзя.
Напишите программу, которая получает строку через аргумент командной строки, проверяет можно ли преобразовать строку в целое число.
Если переданная строка не может быть преобразована в целое число или получаемое число не cможет поместиться в диапазон int,
то выводится сообщение об ошибке и программа завершается.
Если может, то преобразуйте строку в целое число, используя метод toInt, и выведите результат умножения этого числа на 2.
Проверку на наличие аргумента командной строки делать не надо.
 */

public class Main {
    public static void main(String[] args) {
        String string = args[0];
        boolean isNegative = false;

        // определяем знак числа, если он указан
        if (string.charAt(0) == '-') {
            isNegative = true;
            string = string.substring(1);
        }
        if (string.charAt(0) == '+') {
            string = string.substring(1);
        }

        if (!isNegative)
            System.out.println(2 * (long)toInt(string));
        else
            System.out.println(-2 * (long)toInt(string));

    }
        static int toInt (String str){
            long number = 0;
            for (int i = 0; i < str.length(); i++) { // Проверка на отсутствие в строке сторонних символов
                if (!Character.isDigit(str.charAt(i))) {
                    System.out.println("Введенное значение некорректно");
                    System.exit(0);
                }

                number +=((int) str.charAt(i) - 48) * Math.pow(10, (str.length()-1-i));
            }

            if (number>2147483647 || number<-2147483648){ // Проверка на принадлежность диапазону int
                System.out.println("Введенное значение выходит за пределы int");
                System.exit(0);
            }

            return (int) number;
    }
}
