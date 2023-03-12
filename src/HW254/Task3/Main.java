package HW254.Task3;
/*
Через аргумент командной строки передается строка.
Используя StringBuilder, напишите программу,
которая в переданной строке заменяет все нули на единицы и наоборот.
Остальные символы не должны изменится.
Выведите результирующую строку.
Пример аргумента: 01a10vt0101c
Вывод: 10a01vt1010c
Проверку на наличие и корректность аргумента делать не надо.
 */
public class Main {
    public static void main(String[] args) {
        StringBuilder string = new StringBuilder();
        System.out.println(string.append(args[0]).toString().
                replace("0","\n").
                replace("1","0").
                replace("\n", "1"));
    }
}
