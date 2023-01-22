package HW239.Task3;

import static HW239.Task3.Cat.testStaticMethod;

/*
Создать класс животное, сделать его родителем класса Cat.
Создать статический метод “testStaticMethod” который выводит «Это статическое животное».
Вывести в методе main этот метод тремя способами.
 */
public class Main {
    public static void main(String[] args) {
        testStaticMethod();
        Cat.testStaticMethod();
        Cat cat1 = new Cat();
        cat1.testStaticMethod();
    }
}
