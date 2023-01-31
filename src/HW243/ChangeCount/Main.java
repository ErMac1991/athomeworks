package HW243.ChangeCount;
/*
Товар стоит a руб. b коп. За него заплатили c руб. d коп.
Напишите программу, расчитывающую сдачу.
Целые числа a, b, c, d передаются через аргументы командной строки.
Проверку на наличие аргументов делать не надо.
Нужно добавить проверку, что числа больше или равны нулю.
В противном случае нужно вывести пользователю сообщение об ошибке,
и завершить программу.
Так же нужно проверить, что уплаченной суммы хватает для оплаты товара.
В противном случае нужно вывести соответствующее сообщение и завершить программу.
Формат вывода:
Сдача составит e рублей и f копеек.
 */

public class Main {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        int d = Integer.parseInt(args[3]);

        isPossible(a, b, c, d);

    }

    public static void isPossible (int a, int b, int c, int d){ // проверка на ввод корректных значений
        boolean error = false;
        int[] values = new int[] {a, b, c, d};
        for(int i = 0; i < 4; i++) {
            if (values[i] < 0) {
                System.out.println("" + (i+1) + "-е значение указано неверно.");
                error = true;
            }
        }

        if (error){
            System.out.println("Программа будет прервана");
        }
        else {
            isCashEnough((a*100 + b), (c*100 + d));
        }
    }

    public static void isCashEnough(int b, int d){ // проверка на то, что денег хватает на покупку? с переводом в копейки
        if (b > d) {
            System.out.println("Уплаченной суммы не хватает для оплаты товара");
        }
        else {
            changeCount(b, d);
        }

    }

    public static void changeCount(int b, int d){ // вычисление и вывод сдачи
        int change = d - b;
        System.out.println("Сдача составит " + (change/100) + " рублей и " + (change%100) + " копеек");
    }
}
