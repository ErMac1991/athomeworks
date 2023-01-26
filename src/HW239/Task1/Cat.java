package HW239.Task1;

public class Cat {
    int ageYears; // количество лет
    String eyesColor; // цвет глаз
    int weightG; // вес в граммах
    String woolColor; // цвет шерсти

    Cat(){}

    Cat(String eyesColor){
        this.eyesColor = eyesColor;
    }

    Cat(int ageYears, int weightG){
        this.ageYears = ageYears;
        this.weightG = weightG;
    }

    Cat(int ageYears, int weightG, String woolColor){
        this.ageYears = ageYears;
        this.weightG = weightG;
        this.woolColor = woolColor;
    }

    Cat(int ageYears, String eyesColor, int weightG, String woolColor){
        this.woolColor = woolColor;
        this.weightG = weightG;
        this.eyesColor = eyesColor;
        this.ageYears = ageYears;
    }

    @Override
    public String toString() {
        return "Cat{ " +
                "Кошке " + (ageYears != 0 ? ageYears : "неизвестно сколько") + " лет\n" +
                "У кошки " + (eyesColor != null ? eyesColor : "неизвестно какой") + " цвет глаз\n" +
                "Кошка весит " + (weightG != 0 ? weightG + " грамм\n" : "неизвестно сколько\n") +
                "У кошки " + (woolColor != null ? woolColor : "неизвестно какой") + " цвет шерсти" +
                '}';
    }

}
