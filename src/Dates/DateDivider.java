package Dates;

import java.time.*;
import java.util.*;

public class DateDivider { //класс высчитывающий разницу между сегодняшним днем и днем рождения
    int time1; // время в секундах
    int time2; // время в секундах
    boolean isTime; // работает ли тип даты со временем

    DateDivider(Date date1, Date date2){

        isTime = false;
        Divide((date1.toInstant().atZone(ZoneId.systemDefault()).toLocalDate()), date2.toInstant().atZone(ZoneId.systemDefault()).toLocalDate().minusDays(1));
    }

    DateDivider(LocalDate localDate1, LocalDate localDate2){

        isTime = false;
        Divide(localDate1, localDate2.minusDays(1));
    };

    DateDivider(LocalDateTime localDate1, LocalDateTime localDate2){
        isTime = true;
        this.time1 = localDate1.getHour()*3600 + localDate1.getMinute()*60 + localDate1.getSecond();
        this.time2 = localDate2.getHour()*3600 + localDate2.getMinute()*60 + localDate2.getSecond();

        if (this.time2-this.time1 < 0){
            this.time2 = this.time2 + 86400;
            localDate2 = localDate2.minusDays(1);

        }
        Divide(localDate1.toLocalDate(), localDate2.toLocalDate());

    };

    DateDivider(ZonedDateTime localDate1, ZonedDateTime localDate2){
        isTime = true;
        this.time1 = localDate1.getHour()*3600 + localDate1.getMinute()*60 + localDate1.getSecond();
        this.time2 = localDate2.getHour()*3600 + localDate2.getMinute()*60 + localDate2.getSecond();

        if (this.time2-this.time1 < 0){
            this.time2 = this.time2 + 86400;
            localDate2 = localDate2.minusDays(1);

        }
        Divide(localDate1.toLocalDate(), localDate2.toLocalDate());

    };

    DateDivider(GregorianCalendar localDate1, GregorianCalendar localDate2){
        isTime = false;
        Divide((localDate1.toInstant().atZone(ZoneId.systemDefault()).toLocalDate()), localDate2.toInstant().atZone(ZoneId.systemDefault()).toLocalDate().plusMonths(1).minusDays(1));
    };

    void Divide(LocalDate localDate1, LocalDate localDate2){
        Period period = Period.between(localDate1, localDate2); // сравнение дат

        if (localDate1.isBefore(localDate2.plusDays(1))){
            System.out.println("День моего рождения " + localDate1 + " раньше текущей даты " + localDate2.plusDays(1));
        }
        else {
            System.out.println("Привет от Эмета Брауна");
        }

        System.out.print("Разница между моим днем рождения и сегодняшним днем: " + period.getYears() + " л., " + period.getMonths() + " мес. и " + period.getDays() + " д.");

        if (isTime == true){
            System.out.println(" " + (time2-time1)/3600 + "ч." + ((time2-time1)%3600)/60 + "м." + ((time2-time1)%3600)%60 + "с.\n");
        }
        else {
            System.out.println("\n");
        }
    }
}
