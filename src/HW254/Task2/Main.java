package HW254.Task2;
/*
Через аругмент командной строки передается строка - путь до некоторого файла -
содержащая знак «/» или «\». Например, "/bin/java" или "C:\Program Files\Java\bin\java".

Напишите программу, которая для обоих вариантов разделителей, может вывести отдельно путь и имя файла.
Если имя файла отсутствует, т.е. строка оканчивается на "\" или "/",
то выдать ошибку: "Введен некорректный путь до файла."

Пример:
1) Через аргументы передается "/bin/java", выводится:
Путь: /bin/
Имя файла: java

2) Через аргументы передается "C:\Program Files\Java\bin\java", выводится:
Путь: C:\Program Files\Java\bin\
Имя файла: java

3) Через аргументы передается "/", выводится:
Введен некорректный путь до файла.
Проверку на наличие и корректность аргумента делать не надо.
 */
public class Main {
    public static void main(String[] args) {

        String path = "";

        for (int i = 0; i<args.length; i++){ // собираем все аргументы в одну строку
            path += args[i] + " ";
        }
        path = path.strip();

        if (path.charAt(0) == '/'){
            if (path.contains("\\") || path.contains("//") || path.charAt(path.length()-1) == '/'){
                System.out.println("Введен некорректный путь до файла.");
                System.exit(0);
            }
            System.out.println("Путь: " + path.substring(0, path.lastIndexOf('/')+1) +
                    "\nИмя файла: " +  path.substring(path.lastIndexOf('/')+1));
        }

         else if (path.charAt(1) == ':' && path.charAt(2) == '\\'){
            if (path.contains("/") || path.contains("\\\\") || path.charAt(path.length()-1) == '\\'){
                System.out.println("Введен некорректный путь до файла.");
                System.exit(0);
            }
            System.out.println("Путь: " + path.substring(0, path.lastIndexOf('\\')+1) +
                    "\nИмя файла: " +  path.substring(path.lastIndexOf('\\')+1));

        }
         else {
            System.out.println("Введен некорректный путь до файла.");
            System.exit(0);
        }
    }
}
