package HW239.Task1;

import java.util.*;

public class Main {

    public static void main(String[] args) {

    Cat cat0 = new Cat();
    Cat cat1 = new Cat("карий");
    Cat cat2 = new Cat(16,7750);
    Cat cat3 = new Cat(8,5509,"черный");
    Cat cat4 = new Cat(5, "зеленый", 4903,"рыжий");

    List.of(cat0, cat1, cat2, cat3, cat4).stream().forEach(System.out::println);

    }
}
