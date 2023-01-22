package HW239.Task4;

import HW239.Task3.Animal;

public class Cat extends Animal {
    String planet;
    Cat(String planet){
        this.planet = planet;
        printer();
    }

    void printer(){
        System.out.println(planet);
    }
}
