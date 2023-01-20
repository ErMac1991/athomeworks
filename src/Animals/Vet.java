package Animals;

public class Vet {
    static String name; // - имя ветеринара

    Vet (String name){
        this.name = name;
    }
     static void treatAnimal(Animal animal){ // - осуществляет прием у ветеринара, вылечивает здоровье животного
        System.out.println("Ветеринар " + name + " проводит осмотр животного по кличке " + animal.name);

        if (animal.health == HealthState.UNHEALTHY){
            System.out.println("" + animal.name + " болен и нуждается в лечении.");
            animal.health = HealthState.HEALTHY;
            System.out.println("Лечение прошло успешно. Теперь " + animal.name + " здоров.\n");
        }

        else {
            System.out.println("" + animal.name + " здоров и не нуждается в лечении.\n");
        }
    }

}
