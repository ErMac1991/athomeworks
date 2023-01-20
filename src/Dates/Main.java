package Dates;

import java.time.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        /*
1) Создайте объект даты вашего рождения
и выведите на экран 5ю различными форматами вывода.
Повторите, используя каждый класс для работы с датой:
Date, LocalDate, LocalDateTime, ZonedDateTime, GregorianCalendar

3) Посчитайте общее количество времени,
за которое выполняется программа из 1го задания
и выведите результат на экран.
Используйте класс по желанию.
Пример вывода:
Alltime - ms

4) Аналогично 3му заданию, время выполнения в миллисекундах
(создание объекта + вывод на экран),
но для каждого класса из первого задания по отдельности.
Пример вывода:
Date - ms
LocalDate - ms
LocalDateTime - ms
...
(для 5 классов из 1го задания)
 */

        LocalDateTime startForAll = LocalDateTime.now(); // неизменяемый момент начала выполнения программы
        LocalDateTime startTimer = LocalDateTime.now(); // изменяемый момент начала выполнения этапа программы

        Date date1 = new Date(91, 10, 24); //создаем обект класса Date с днем рождения

        LocalDateTime finishTimer = LocalDateTime.now(); // изменяемый момент конца выполнения этапа программы
        ProgramTimer timer = new ProgramTimer(startTimer, finishTimer);
        System.out.println("Date - " + timer.ProgramTimer(timer.start, timer.finish) + "мс.");

        LocalDate date2 = LocalDate.of(1991, 11, 24); //создаем обект класса LocalDate с днем рождения

        startTimer = LocalDateTime.now();
        timer = new ProgramTimer(finishTimer, startTimer);
        System.out.println("LocalDate - " + timer.ProgramTimer(timer.start, timer.finish) + "мс.");

        LocalDateTime date3 = LocalDateTime.of(1991, 11, 24, 23,55,17); //создаем обект класса LocalDateTime с днем рождения

        finishTimer = LocalDateTime.now();
        timer = new ProgramTimer(startTimer, finishTimer);
        System.out.println("LocalDateTime - " + timer.ProgramTimer(timer.start, timer.finish) + "мс.");

        ZonedDateTime date4 = ZonedDateTime.of(1991,11,24,23,55,17,33, ZoneId.of("Europe/Moscow")); //создаем обект класса ZonedDateTime с днем рождения

        startTimer = LocalDateTime.now();
        timer = new ProgramTimer(finishTimer, startTimer);
        System.out.println("ZonedDateTime - " + timer.ProgramTimer(timer.start, timer.finish) + "мс.");

        GregorianCalendar date5 = new GregorianCalendar(1991,11,24); //создаем обект класса GregorianCalendar с днем рождения

        finishTimer = LocalDateTime.now();
        timer = new ProgramTimer(startTimer, finishTimer);
        System.out.println("GregorianCalendar - " + timer.ProgramTimer(timer.start, timer.finish) + "мс.");

        timer = new ProgramTimer(startForAll, finishTimer);
        System.out.println("Первая часть задания выполнилась за " + timer.ProgramTimer(timer.start, timer.finish) + "мс.\n");

    /*
    2) Для каждого класса из задания 1 создайте объект текущего времени
и сравните с датой вашего рождения соответствующего типа.
Выведите разницу на экран.
     */

        Date now1 = new Date();
        LocalDate now2 = LocalDate.now();
        LocalDateTime now3 = LocalDateTime.now();
        ZonedDateTime now4 = ZonedDateTime.now();
        GregorianCalendar now5 = new GregorianCalendar();



        DateDivider divider = new DateDivider(date1, now1);
        divider = new DateDivider(date2, now2);
        divider = new DateDivider(date3, now3);
        divider = new DateDivider(date4, now4);
        divider = new DateDivider(date5, now5);

    }
}
