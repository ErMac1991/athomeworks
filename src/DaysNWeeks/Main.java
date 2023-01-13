package DaysNWeeks;

/*
Создать класс DaysOfWeek cо статическими финальными полями - днями недель (Значения: "Понедельник", "Вторник" и тд)
Создать класс Day c полем String dayOfWeek и поле с номером относительно начала месяца (не статические).
Создать класс Week содержащий 7 полей Day и поле номера недели относительно начала года (не статическое).

В методе main создать 3 разные недели и вывести всю информацию о них (для ориентира за год считать 2022)
    Формат вывода:
Неделя {номер недели}:
День - Число
День - Число
...

P.S День должен отображать число месяца и название дня недели , Неделя должна отображать номер недели относительно начала года и как положено - 7 дней, при создании объектов недели и выводе на экран ориентироваться на календарь 2022 года. Например : 2 неделя 2022 года - Понедельник 3 число , Вторник 4 число и тд.

 */

public class Main {
    public static void main(String[] args) {

        // Для 2022 года считаем первую неделю с 03.01.2022

        int weekNum = 5;
        System.out.println("Неделя " + weekNum + ":");
        Week firstWeek = new Week(weekNum);
        System.out.println(" ");


        weekNum = 26;
        System.out.println("Неделя " + weekNum + ":");
        Week secondWeek = new Week(weekNum);
        System.out.println(" ");

        weekNum = 52;
        System.out.println("Неделя " + weekNum + ":");
        Week thirdWeek = new Week(weekNum);

    }
}
