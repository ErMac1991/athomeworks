package HW247.Task4;
/*
В основном классе программы объявлена и инициализиована целочисленная переменная n.
Реализуйте метод boolean isPrime(int x), который возвращает true, если x - простое число.
Реализуйте метод int nextInt(int x),
который возвращает случайно сгенерированное целое число от 0 до x, x не включая.
Используя эти методы, напишите программу, которая генерит целые
числа в диапазоне от 1 до n (не включая n) до тех пор, пока не сгенерит простое число.
Для генерации простых чисел можно пользоваться классом
java.lang.Math или java.util.Random.
 */
public class Main {
    static int n = 100;
    static int k;

    public static void main(String[] args) {

        do {
            k =  nextInt(n);
            System.out.println(k);
        }
        while (!isPrime(k));
        System.out.println("Простое число найдено: " + k);

    }

    public static boolean isPrime(int x){  // метод, возвращающий true, если x - простое число
        if (x == 0 || x == 1) {     // исключаем 0 и 1 из проверки, они простыми не являются
            return false;
        }

        for (int i = 2; i < x; i++ ){
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    };

    public static int nextInt(int x){   // генерируем целое число от 0 до x (не включая x)
        x = (int) (Math.random() * (x-1));
        return x;
    };
}
