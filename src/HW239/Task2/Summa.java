package HW239.Task2;

public class Summa {

    public static int sum(int one, int two){ //- возвращающий сумму int от 2х переменных int
        return (one + two);
    }

    public static double sum(int one, int two, int three){ //- возвращающий сумму double от 3х переменных int
        return (one + two + three);
    }

    public static double sum(int one, int two, double three, double four, double five){ //возвращающий сумму double от 2х и от 3х переменных double
        return ((double) one + (double) two + three + four + five);
    }

    public static double sum(int one, double two, double three){ //- возвращающий сумму double от 1 int и от 2х переменных double
        return ((double) one + (double) two + three);
    }

    public static  double sum(Integer one, Integer two){ // Попробовать создать метод возвращающий double из 2х переменных Integer
        return (one + two);
    }
}
