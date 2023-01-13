package DaysNWeeks;

public class Day {
    String dayOfWeek; // День недели. Не статическое.
    int dayOfMonth; // Дата в месяце. Не статическое.
    String month; // Месяц
    int maxDaysInMonth; // Число дней в месяце
    String[] months = new String[]
            {"Январь", "Февраль", "Март", "Апрель", "Май", "Июнь", "Июль", "Август", "Сентябрь", "Октябрь", "Ноябрь", "Декабрь"};
    boolean dateOutOfLimit = false;

    Day(int WeekOfYear, int dayOfWeek) {

        int i = 0;

        // вычисляем месяц
        int numOfMondayInYear = (WeekOfYear - 1) * 7 + 3; // Порядковый номер понедельника в году. Для 2022 года считаем первую неделю с 03.01.2022

        if (numOfMondayInYear <= 31) {
            month = months[i];
            maxDaysInMonth = 31;
            dayOfMonth = numOfMondayInYear;
        }
        if (31 < numOfMondayInYear && numOfMondayInYear <= (31 + 28)) {
            i=1;
            month = months[i];
            maxDaysInMonth = 28;
            dayOfMonth = numOfMondayInYear - 31;
        }
        if ((31 + 28) < numOfMondayInYear && numOfMondayInYear <= (31 + 28 + 31)) {
            i=2;
            month = months[i];
            maxDaysInMonth = 31;
            dayOfMonth = numOfMondayInYear - 59;
        }
        if ((31 + 28 + 31) < numOfMondayInYear && numOfMondayInYear <= (31 + 28 + 31 + 30)) {
            i=3;
            month = months[i];
            maxDaysInMonth = 30;
            dayOfMonth = numOfMondayInYear - 90;
        }
        if ((31 + 28 + 31 + 30) < numOfMondayInYear && numOfMondayInYear <= (31 + 28 + 31 + 30 + 31)) {
            i=4;
            month = months[i];
            maxDaysInMonth = 31;
            dayOfMonth = numOfMondayInYear - 120;
        }
        if ((31 + 28 + 31 + 30 + 31) < numOfMondayInYear && numOfMondayInYear <= (31 + 28 + 31 + 30 + 31 + 30)) {
            i=5;
            month = months[i];
            maxDaysInMonth = 30;
            dayOfMonth = numOfMondayInYear - 151;
        }
        if ((31 + 28 + 31 + 30 + 31 + 30) < numOfMondayInYear && numOfMondayInYear <= (31 + 28 + 31 + 30 + 31 + 30 + 31)) {
            i=6;
            month = months[i];
            maxDaysInMonth = 31;
            dayOfMonth = numOfMondayInYear - 181;
        }
        if ((31 + 28 + 31 + 30 + 31 + 30 + 31) < numOfMondayInYear && numOfMondayInYear <= (31 + 28 + 31 + 30 + 31 + 30 + 31 + 31)) {
            i=7;
            month = months[i];
            maxDaysInMonth = 31;
            dayOfMonth = numOfMondayInYear - 212;
        }
        if ((31 + 28 + 31 + 30 + 31 + 30 + 31 + 31) < numOfMondayInYear && numOfMondayInYear <= (31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30)) {
            i=8;
            month = months[i];
            maxDaysInMonth = 30;
            dayOfMonth = numOfMondayInYear - 243;
        }
        if ((31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30) < numOfMondayInYear && numOfMondayInYear <= (31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31)) {
            i=9;
            month = months[i];
            maxDaysInMonth = 31;
            dayOfMonth = numOfMondayInYear - 273;
        }
        if ((31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31) < numOfMondayInYear && numOfMondayInYear <= (31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30)) {
            i=10;
            month = months[i];
            maxDaysInMonth = 30;
            dayOfMonth = numOfMondayInYear - 304;
        }
        if ((31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30) < numOfMondayInYear && numOfMondayInYear <= (31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + 31)) {
            i=11;
            month = months[i];
            maxDaysInMonth = 31;
            dayOfMonth = numOfMondayInYear - 334;
        }

        dayOfMonth = dayOfMonth + dayOfWeek - 1;

        if (dayOfMonth > maxDaysInMonth && i<11) {

                i++;
                dayOfMonth = dayOfMonth - maxDaysInMonth;
                month = months[i];;
            }

            if (dayOfMonth > maxDaysInMonth && i>=11) {
                dateOutOfLimit = true;
                i= i - 11;
                month = months[i];
                System.out.println("День " + (dayOfMonth - maxDaysInMonth) + " (месяц: " + month + ") принадлежит следующему году");
            }

            if (dateOutOfLimit == false){
                this.dayOfWeek = DaysOfWeek.Week[dayOfWeek-1];
                System.out.println("" + this.dayOfWeek + " - " + dayOfMonth + " число (месяц: " + month + ")");
            }

        dateOutOfLimit = false;
        i=0;

    }
}
