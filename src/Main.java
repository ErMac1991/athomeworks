/*
    Сделать основные арифметические действия:
    - плюс
    - минус
    - умножить
    - разделить без остатка
    - получить остаток от деления
    с очень большими числами (>20 знаков) как с целочисленными, так и с плавающей точкой.

    1) Использовать типы BigDecimal и BigInteger

    2) Создать метод main и в нем выполнить все действия
 */

import java.math.*;

public class Main {
    public static void main(String[] args) {

        // Инициализация

        BigInteger a = new BigInteger("1234567890123456789012345678901234567890123456");
        BigInteger b = new BigInteger("1912345678901234567890");
        BigDecimal c = new BigDecimal("98765432109876543210987654321098765432109876543.9876543210987654321");
        BigDecimal d = new BigDecimal("432109876543210987654321.6543219876543210987");

        // Реализация

        System.out.println("Сложение:");
        System.out.println(" Целочисленных:");
        System.out.println("  " + a + " + " + b + " = " + a.add(b));
        System.out.println(" Дробных:");
        System.out.println("  " + c + " + " + d + " = " + c.add(d) + "\n");

        System.out.println("Вычитание:");
        System.out.println(" Целочисленных:");
        System.out.println("  " + a + " - " + b + " = " + a.subtract(b));
        System.out.println(" Дробных:");
        System.out.println("  " + c + " - " + d + " = " + c.subtract(d) + "\n");

        System.out.println("Умножение:");
        System.out.println(" Целочисленных:");
        System.out.println("  " + a + " x " + b + " = " + a.multiply(b));
        System.out.println(" Дробных:");
        System.out.println("  " + c + " x " + d + " = " + c.multiply(d) + "\n");

        System.out.println("Деление без остатка:");
        System.out.println(" Целочисленных:");
        System.out.println("  " + a + " / " + b + " = " + a.divide(b));
        System.out.println(" Дробных (с округлением):");
        System.out.println("  " + c + " / " + d + " = " + c.divide(d, RoundingMode.HALF_UP) + "\n");

        System.out.println("Остаток от деления:");
        System.out.println(" Целочисленных:");
        System.out.println("  " + a + " и " + b + " = " + a.mod(b));


    }
}