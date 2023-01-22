package HW239.Task1;

/*
Создать класс Cat, с свойствами количество лет, цвет глаз, вес и цвет шерсти.
Создать максимально возможное количество конструкторов, создать котиков в методе Main и вывести на их экран.
Не забываем про метод toString() для котов.
 */
public class Main {

    static CharSequence chars;

    public static void main(String[] args) {
    Cat cat1 = new Cat();
    Cat cat2 = new Cat(3578);
    Cat cat3 = new Cat(12L);
    Cat cat4 = new Cat("карие");
    Cat cat5 = new Cat(chars = "черный", "черные");
    Cat cat6 = new Cat(3L,chars = "белый");
    Cat cat7 = new Cat(6801,"зеленые");
    Cat cat8 = new Cat(8L,5509,"зеленые");
    Cat cat9 = new Cat(chars = "черепаховый", 6L,"зеленые");
    Cat cat10 = new Cat(14L, chars = "рыжий", 7503,"желтые");
    Cat cat11 = new Cat("голубые", chars = "серый", 3907, 1L);

    }
}
