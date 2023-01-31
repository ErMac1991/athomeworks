package HW243.Triangle;
/*
В программу через аргументы командной строки передаются
три натуральных числа – стороны треугольника.

Необходимо определить тип треугольника с данными сторонами
(остроугольный, тупоугольный, прямоугольный)
вывести одно из слов:
- right для прямоугольного треугольника,
- acute для остроугольного треугольника,
- obtuse для тупоугольного треугольника
- или impossible, если входные числа не образуют треугольника.

Стороны сторон передаются через аргументы командной строки.
Проверку на наличие аргументов делать не надо.
 */
public class Main {
    public static void main(String[] args) {

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        getLongestSide(a, b, c);
    }

    public static void getLongestSide (int a, int b, int c){ // вычисляем самую длинную сторону треугольника
        int longestSide = a;
        int other1Side = b;
        int other2Side = c;

        if (b>longestSide) {
            longestSide = b;
            other1Side = a;
        }
        if (c>longestSide) {
            longestSide = c;
            other1Side = a;
            other2Side = b;
        }
        isPossible (longestSide, other1Side, other2Side);
    }

    public static void isPossible(int a, int b, int c){ // выясняем существует ли треугольник
        if (a >= b + c || a <= 0 || b <= 0 || c <= 0){
            System.out.println("impossible");
        }
        else{
            typeOfTriangle(a, b, c);
        }
    }

    public static void typeOfTriangle (int a, int b, int c){ // выясняем тип треугольника

        if (a*a == b*b + c*c){
            System.out.println("right");
        };
        if (a*a < b*b + c*c){
            System.out.println("acute");
        };
        if (a*a > b*b + c*c){
            System.out.println("obtuse");
        };
    }
}
