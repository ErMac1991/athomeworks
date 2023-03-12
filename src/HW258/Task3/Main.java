package HW258.Task3;
/*
Реализуйте метод void bubbleSort(int[] a),
который сортирует целочисленные элементы в массиве a по возрастанию (первый элемент - минимальный)
согласно алгоритму пузырьковой сортировки.
en.wikipedia.org/wiki/Bubble_sort
Используя метод fillArray из первого задания и метод bubbleSort,
напишите программу, которая создает массив из 20 целочисленных элементов, выводит элементы в одну строку, разделив пробелами.
Затем, используя метод bubbleSort, сортирует созданный массив
и выводит элементы отсортированного массива в одну строку, разделив пробелами.
 */
public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[20];
        fillArray(numbers);
        bubbleSort(numbers);

        for (int i = 0; i < numbers.length; i++){
            System.out.print("" + numbers[i] + " ");
        }
    }

    public static void bubbleSort(int[] a){
        boolean isReplaced = true;

        while (isReplaced){
            isReplaced = false;
            for(int i = 0; i < a.length - 1; i++){
                if (a[i] > a[i+1]) {
                    a[i] = a[i] + a[i + 1];
                    a[i + 1] = a[i] - a[i + 1];
                    a[i] = a[i] - a[i + 1];
                    isReplaced = true;

                }
            }
        }
    }

    public static void fillArray(int[] a){
        for (int i = 0; i < a.length; i++){
            a[i] = (int) (Math.random() * 19 - 9);
            System.out.print("" + a[i] + " ");
        }

        System.out.println();
    }
}
