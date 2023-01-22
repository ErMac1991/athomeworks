package HW239.Task2;

public class Summa {
    int a, b, c;
    double x, y, z;
    Integer integerOne;
    Integer integerTwo;

    Summa(int a, int b, int c, double x, double y, double z, Integer integerOne, Integer integerTwo){
        this.a = a;
        this.b = b;
        this.c = c;
        this.x = x;
        this.y = y;
        this.z = z;
        this.integerOne = integerOne;
        this.integerTwo = integerTwo;

    }

    int sum(int one, int two){ //- возвращающий сумму int от 2х переменных int
        return (one + two);
    }

    double sum(int one, int two, int three){ //- возвращающий сумму double от 3х переменных int
        return (one + two + three);
    }

    double sum(int one, int two, double three, double four, double five){ //возвращающий сумму double от 2х и от 3х переменных double
        return ((double) one + (double) two + three + four + five);
    }

    double sum(int one, double two, double three){ //- возвращающий сумму double от 1 int и от 2х переменных double
        return ((double) one + (double) two + three);
    }

    double sumDoubleFromInts(Integer one, Integer two){ // Попробовать создать метод возвращающий double из 2х переменных Integer
        return (one + two);
    }
}
