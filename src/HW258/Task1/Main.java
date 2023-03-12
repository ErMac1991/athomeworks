package HW258.Task1;
/*
Реализуйте метод void fillArray(int[] a),
который устанавливает элементам целочисленного массива а случайные целые числа -9 до 9.
Напишите программу, которая создает массив из 20 целочисленных элементов,
заполняет его случайными значениями, используя метод fillArray,
и печатает его элементы в одну строку, разделив пробелами.
 */
public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[20];
        fillArray(numbers);

    }
    public static void fillArray(int[] a){
        for (int i = 0; i < a.length; i++){
            a[i] = (int) (Math.random() * 19 - 9);
            System.out.print("" + a[i] + " ");
        }

    }
}
