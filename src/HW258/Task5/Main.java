package HW258.Task5;
/*
Напишите программу, которая создает зубчатый массив целочисленных элементов, сгенеренных случайным образов в диапазоне -9 до 9.
Массив должен содержать не более 5 строк и каждая строка иметь не более 7 столбцов.
Выведите массив на экран в порядке убывания сумм элементов строк.
 */
public class Main {
    public static void main(String[] args) {

        // Создаем зубчатый массив

        int[][] numbers = new int[(int) (Math.random() * 5) + 1][]; // Зубчатый массив
        int[][] linesOrder = new int[2][numbers.length]; // Массив с суммами строк зубчатого массива и из порядковыми номерами
        int summInRow; // Сумма чисел в одном ряду массива

        System.out.println("Исходный массив:");

        for (int row = 0; row < numbers.length; row++) {
            summInRow = 0;
            numbers[row] = new int[(int) (Math.random() * 7) + 1];

            for (int columnID = 0; columnID < numbers[row].length; columnID++) {
                numbers[row][columnID] = (int) (Math.random() * 19 - 9);
                summInRow += numbers[row][columnID];
                System.out.print("" + numbers[row][columnID] + " ");
            }
            linesOrder[0][row] = summInRow;
            linesOrder[1][row] = row;
            System.out.println();
        }

        // Фильтруем суммы

        boolean isReplaced = true;

        while (isReplaced) {
            isReplaced = false;
            for (int i = 0; i < linesOrder[0].length - 1; i++) {
                if (linesOrder[0][i] < linesOrder[0][i + 1]) {
                    linesOrder[0][i] = linesOrder[0][i] + linesOrder[0][i + 1];
                    linesOrder[0][i + 1] = linesOrder[0][i] - linesOrder[0][i + 1];
                    linesOrder[0][i] = linesOrder[0][i] - linesOrder[0][i + 1];
                    linesOrder[1][i] = linesOrder[1][i] + linesOrder[1][i + 1];
                    linesOrder[1][i + 1] = linesOrder[1][i] - linesOrder[1][i + 1];
                    linesOrder[1][i] = linesOrder[1][i] - linesOrder[1][i + 1];
                    isReplaced = true;

                }
            }
        }

        // Выводим отфильтрованный массив
        System.out.println("\nОтфильтрованный массив:");

        for (int row = 0; row < numbers.length; row++) {
            for (int columnID = 0; columnID < numbers[linesOrder[1][row]].length; columnID++) {
                System.out.print("" + numbers[linesOrder[1][row]][columnID] + " ");
            }
            System.out.println();

        }
    }
}
