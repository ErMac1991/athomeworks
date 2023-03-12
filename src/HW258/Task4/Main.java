package HW258.Task4;

/*
Реализуйте метод int median(int[] a), который возвращает целочисленное значение медианы массива а.
Для отсортированного массива четной длины медиана расчитывается как среднее арифметическое двух центральных элементов.
Для отсортированного массива нечетной длины медиана расчитывается как центральный элемент.
В общем случае, для набора 1 2 3 4 5 медиана равна 3, а для четного набора 1 2 3 4 5 6 медиана расчитывается как (3 + 4)/2 = 3.5
Для сортировки массива используйте метод Arrays.sort или метод bubbleSort из третьего задания.
Порядок элементов в исходном массиве, который передается в метод через аргумент, не должен быть изменен.
Напишите программу, которая создает массив из 20 целочисленных элементов,
заполняет случайным образом , выводит элементы в одну строку, разделив пробелами.
Затем, используя метод median, получите и выведите значение вычисленной медианы.
После этого вновь напечатайте элементы исходного массива в одну строку, разделив пробелами,
чтобы убедиться, что их порядок не изменился.
Пример работы программы:
Вывод:
Создан массив: 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20
Медиана: 10
Повторный ввод исходного массива: 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20
 */
public class Main {
    static boolean isSimple;
    public static void main(String[] args) {

        // Создаем массив
        int[] numbers = new int[20];
        System.out.print("Создан массив: ");
        fillArray(numbers);

        // Сортируем массив
        System.out.print("Отсортированный массив: ");
        bubbleSort(numbers);

        for (int i = 0; i < numbers.length; i++){
            System.out.print("" + numbers[i] + " ");
        }
        System.out.println();

        isSimple = (numbers[numbers.length / 2] + numbers[numbers.length / 2 - 1]) % 2 == 0;

        System.out.print("Медиана: ");

        if (isSimple){
            System.out.println(median(numbers));
        }
        else{
            System.out.println("" + median(numbers) + ".5");
        }

        System.out.print("Повторный ввод исходного массива: ");

        for (int i = 0; i < numbers.length; i++){
            System.out.print("" + numbers[i] + " ");
        }

    }

    public static int median(int[] a){
        int median;
        if (a.length % 2 == 0){
            median = (a[a.length/2] + a[a.length/2 - 1]) / 2;
        }

        else{
            median = a[a.length/2];
            isSimple = true;
        }

        return median;
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
            a[i] = (int) (Math.random() * 19);
            System.out.print("" + a[i] + " ");

        }
        System.out.println();
    }
}
