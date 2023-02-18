package HW247.Task5;

public class Calculator {
public static int add(int x, int y) { // выполнение x + y
    return (x+y);
}
public static int sub(int x, int y) { // выполнение x - y
    return (x-y);
}
public static int mult(int x, int y) { // выполнение x * y
    return (x*y);
}
public static int divide(int x, int y) { // выполнение x / y.
    if (y == 0){    // Проверка на 0 в знаменателе
        System.out.println("Операция не может быть выполнена");
        System.exit(0);
    }
    return (x/y);
}
}
