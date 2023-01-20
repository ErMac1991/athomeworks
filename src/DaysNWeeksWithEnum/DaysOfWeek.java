package DaysNWeeksWithEnum;


public enum DaysOfWeek { // Дни недели

    MON("Понедельник"),
    TUE("Вторник"),
    WEN("Среда"),
    THI("Четверг"),
    FRI("Пятница"),
    SAT("Суббота"),
    SUN("Воскресение");

    String DayOfWeek;

    DaysOfWeek(String DayOfWeek){
        this.DayOfWeek = DayOfWeek;
    }

    static DaysOfWeek[] Week = DaysOfWeek.values();

}
