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
        int priceRub = Integer.parseInt(args[0]); // Стоимость товара (руб)
        int priceKop = Integer.parseInt(args[1]); // Стоимость товара (коп)
        int moneyRub = Integer.parseInt(args[2]); // Заплачено за товар (руб)
        int moneyKop = Integer.parseInt(args[3]); // Заплачено за товар (коп)

        int[] values = new int[]{priceRub, priceKop, moneyRub, moneyKop};

         // проверка на ввод корректных значений

            for (int i = 0; i < 4; i++) {
                if (values[i] < 0) {
                    System.out.println("" + (i + 1) + "-е значение указано неверно.");
                    System.out.println("Программа будет прервана");
                    System.exit(0);
                }
            }

        // проверка на то, что денег хватает на покупку? с переводом в копейки

        priceKop = priceRub * 100 + priceKop;
        moneyKop = moneyRub * 100 + moneyKop;

            if (priceKop > moneyKop) {
                System.out.println("Уплаченной суммы не хватает для оплаты товара");
                System.exit(0);
            }

            if (priceKop == moneyKop) {
                System.out.println("Сдачи после покупки не осталось");
                System.exit(0);
            }

        // вычисление и вывод сдачи

            System.out.println("Сдача составит " + ((moneyKop - priceKop) / 100) + " рублей и " + ((moneyKop - priceKop) % 100) + " копеек");
        }
    }


