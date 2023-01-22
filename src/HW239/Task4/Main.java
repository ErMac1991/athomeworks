package HW239.Task4;

import static HW239.Task4.Animal.planet;

/*
Создать в классе Животное статическое поле планета = Земля;
Вывести на экран данное поле.
Заменить это поле на Луна
У созданной кошки вывести данное поле.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(planet);
        planet = "Луна";
        Cat cat1 = new Cat(planet);

    }
}
