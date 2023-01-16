package Dates;


import java.time.LocalDateTime;

public class ProgramTimer { // класс, вычисляющий из даты время в мс.
    static int start;
    static int finish;

    ProgramTimer(LocalDateTime localDate1, LocalDateTime localDate2){
        this.start = localDate1.getHour()* 3600000 + localDate1.getMinute()* 60000 + localDate1.getSecond()*1000 + localDate1.getNano()/1000000;
        this.finish = localDate2.getHour()* 3600000 + localDate2.getMinute()* 60000 + localDate2.getSecond()*1000 + localDate2.getNano()/1000000;
    }

    public static int ProgramTimer(int start, int finish){ // метод возвращающий разницу в мс.

        return (finish - start);

    }

}
