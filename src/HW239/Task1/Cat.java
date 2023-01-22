package HW239.Task1;

public class Cat {
    long ageYears; // количество лет 1
    String eyesColor; // цвет глаз 2
    int weightG; // вес в граммах 3
    CharSequence woolColor; // цвет шерсти 4

    Cat(){
        System.out.println("Есть же кошка!");
    }

    Cat(long ageYears){
        this.ageYears = ageYears;
        System.out.println("Кошке " + this.ageYears + " лет");
    }
    Cat(String eyesColor){
        this.eyesColor = eyesColor;
        System.out.println("У кошки " + this.eyesColor + " глаза");
    }
    Cat(int weightG){
        this.weightG = weightG;
        System.out.println("Кошка весит " + this.weightG + " грамм");
    }
    Cat(CharSequence woolColor){
        this.woolColor = woolColor;
        System.out.println("У кошки " + this.woolColor + " окрас шерсти");
    }


    Cat(long ageYears, String eyesColor){
        this.ageYears = ageYears;
        this.eyesColor = eyesColor;
        System.out.print("Кошке " + this.ageYears + " лет. ");
        System.out.println("У кошки " + this.eyesColor + " глаза");
    }
    Cat(long ageYears, int weightG){
        this.ageYears = ageYears;
        this.weightG = weightG;
        System.out.print("Кошке " + this.ageYears + " лет. ");
        System.out.println("Кошка весит " + this.weightG + " грамм");
    }
    Cat(long ageYears, CharSequence woolColor){
        this.ageYears = ageYears;
        this.woolColor = woolColor;
        System.out.print("Кошке " + this.ageYears + " лет. ");
        System.out.println("У кошки " + this.woolColor + " окрас шерсти");
    }
    Cat(String eyesColor, long ageYears){
        this.eyesColor = eyesColor;
        this.ageYears = ageYears;
        System.out.print("Кошке " + this.ageYears + " лет. ");
        System.out.println("У кошки " + this.eyesColor + " глаза");
    }
    Cat(String eyesColor, int weightG){
        this.eyesColor = eyesColor;
        this.weightG = weightG;
        System.out.print("У кошки " + this.eyesColor + " глаза. ");
        System.out.println("Кошка весит " + this.weightG + " грамм");

    }
    Cat(String eyesColor, CharSequence woolColor){
        this.eyesColor = eyesColor;
        this.woolColor = woolColor;
        System.out.print("У кошки " + this.eyesColor + " глаза. ");
        System.out.println("У кошки " + this.woolColor + " окрас шерсти");
    }
    Cat(int weightG, long ageYears){
        this.weightG = weightG;
        this.ageYears = ageYears;
        System.out.print("Кошке " + this.ageYears + " лет. ");
        System.out.println("Кошка весит " + this.weightG + " грамм");
    }
    Cat(int weightG, String eyesColor){
        this.weightG = weightG;
        this.eyesColor = eyesColor;
        System.out.print("У кошки " + this.eyesColor + " глаза. ");
        System.out.println("Кошка весит " + this.weightG + " грамм");
    }
    Cat(int weightG, CharSequence woolColor){
        this.weightG = weightG;
        this.woolColor = woolColor;
        System.out.print("Кошка весит " + this.weightG + " грамм. ");
        System.out.println("У кошки " + this.woolColor + " окрас шерсти");
    }
    Cat(CharSequence woolColor, long ageYears){
        this.woolColor = woolColor;
        this.ageYears = ageYears;
        System.out.print("Кошке " + this.ageYears + " лет. ");
        System.out.println("У кошки " + this.woolColor + " окрас шерсти");
    }
    Cat(CharSequence woolColor, String eyesColor){
        this.woolColor = woolColor;
        this.eyesColor = eyesColor;
        System.out.print("У кошки " + this.eyesColor + " глаза. ");
        System.out.println("У кошки " + this.woolColor + " окрас шерсти");
    }
    Cat(CharSequence woolColor, int weightG){
        this.woolColor = woolColor;
        this.weightG = weightG;
        System.out.print("Кошка весит " + this.weightG + " грамм. ");
        System.out.println("У кошки " + this.woolColor + " окрас шерсти");
    }

    Cat(long ageYears, String eyesColor, int weightG){
        this.ageYears = ageYears;
        this.eyesColor = eyesColor;
        this.weightG = weightG;
        System.out.print("Кошке " + this.ageYears + " лет. ");
        System.out.print("У кошки " + this.eyesColor + " глаза. ");
        System.out.println("Кошка весит " + this.weightG + " грамм");
    }
    Cat(long ageYears, String eyesColor, CharSequence woolColor){
        this.ageYears = ageYears;
        this.eyesColor = eyesColor;
        this.woolColor = woolColor;
        System.out.print("Кошке " + this.ageYears + " лет. ");
        System.out.print("У кошки " + this.eyesColor + " глаза. ");
        System.out.println("У кошки " + this.woolColor + " окрас шерсти");
    }
    Cat(long ageYears, int weightG, String eyesColor){
        this.ageYears = ageYears;
        this.weightG = weightG;
        this.eyesColor = eyesColor;
        System.out.print("Кошке " + this.ageYears + " лет. ");
        System.out.print("У кошки " + this.eyesColor + " глаза. ");
        System.out.println("Кошка весит " + this.weightG + " грамм");
    }
    Cat(long ageYears, int weightG, CharSequence woolColor){
        this.ageYears = ageYears;
        this.weightG = weightG;
        this.woolColor = woolColor;
        System.out.print("Кошке " + this.ageYears + " лет. ");
        System.out.print("Кошка весит " + this.weightG + " грамм. ");
        System.out.println("У кошки " + this.woolColor + " окрас шерсти");
    }
    Cat(long ageYears, CharSequence woolColor, String eyesColor){
        this.ageYears = ageYears;
        this.woolColor = woolColor;
        this.eyesColor = eyesColor;
        System.out.print("Кошке " + this.ageYears + " лет. ");
        System.out.print("У кошки " + this.eyesColor + " глаза. ");
        System.out.println("У кошки " + this.woolColor + " окрас шерсти");
    }
    Cat(long ageYears, CharSequence woolColor, int weightG){
        this.ageYears = ageYears;
        this.woolColor = woolColor;
        this.weightG = weightG;
        System.out.print("Кошке " + this.ageYears + " лет. ");
        System.out.print("Кошка весит " + this.weightG + " грамм. ");
        System.out.println("У кошки " + this.woolColor + " окрас шерсти");
    }
    Cat(String eyesColor, long ageYears, int weightG){
        this.eyesColor = eyesColor;
        this.ageYears = ageYears;
        this.weightG = weightG;
        System.out.print("Кошке " + this.ageYears + " лет. ");
        System.out.print("У кошки " + this.eyesColor + " глаза. ");
        System.out.println("Кошка весит " + this.weightG + " грамм");
    }
    Cat(String eyesColor, long ageYears, CharSequence woolColor){
        this.eyesColor = eyesColor;
        this.ageYears = ageYears;
        this.woolColor = woolColor;
        System.out.print("Кошке " + this.ageYears + " лет. ");
        System.out.print("У кошки " + this.eyesColor + " глаза. ");
        System.out.println("У кошки " + this.woolColor + " окрас шерсти");
    }
    Cat(String eyesColor, int weightG, long ageYears){
        this.eyesColor = eyesColor;
        this.ageYears = ageYears;
        this.weightG = weightG;
        System.out.print("Кошке " + this.ageYears + " лет. ");
        System.out.print("У кошки " + this.eyesColor + " глаза. ");
        System.out.println("Кошка весит " + this.weightG + " грамм");
    }
    Cat(String eyesColor, int weightG, CharSequence woolColor){
        this.eyesColor = eyesColor;
        this.weightG = weightG;
        this.woolColor = woolColor;
        System.out.print("У кошки " + this.eyesColor + " глаза. ");
        System.out.print("Кошка весит " + this.weightG + " грамм. ");
        System.out.println("У кошки " + this.woolColor + " окрас шерсти");
    }
    Cat(String eyesColor, CharSequence woolColor, long ageYears){
        this.eyesColor = eyesColor;
        this.woolColor = woolColor;
        this.ageYears = ageYears;
        System.out.print("Кошке " + this.ageYears + " лет. ");
        System.out.print("У кошки " + this.eyesColor + " глаза. ");
        System.out.println("У кошки " + this.woolColor + " окрас шерсти");
    }
    Cat(String eyesColor, CharSequence woolColor, int weightG){
        this.eyesColor = eyesColor;
        this.woolColor = woolColor;
        this.weightG = weightG;
        System.out.print("У кошки " + this.eyesColor + " глаза. ");
        System.out.print("Кошка весит " + this.weightG + " грамм. ");
        System.out.println("У кошки " + this.woolColor + " окрас шерсти");
    }
    Cat(int weightG, long ageYears, String eyesColor){
        this.weightG = weightG;
        this.ageYears = ageYears;
        this.eyesColor = eyesColor;
        System.out.print("Кошке " + this.ageYears + " лет. ");
        System.out.print("У кошки " + this.eyesColor + " глаза. ");
        System.out.println("Кошка весит " + this.weightG + " грамм");
    }
    Cat(int weightG, long ageYears, CharSequence woolColor){
        this.weightG = weightG;
        this.ageYears = ageYears;
        this.woolColor = woolColor;
        System.out.print("Кошке " + this.ageYears + " лет. ");
        System.out.print("Кошка весит " + this.weightG + " грамм. ");
        System.out.println("У кошки " + this.woolColor + " окрас шерсти");
    }
    Cat(int weightG, String eyesColor, long ageYears){
        this.weightG = weightG;
        this.eyesColor = eyesColor;
        this.ageYears = ageYears;
        System.out.print("Кошке " + this.ageYears + " лет. ");
        System.out.print("У кошки " + this.eyesColor + " глаза. ");
        System.out.println("Кошка весит " + this.weightG + " грамм");
    }
    Cat(int weightG, String eyesColor, CharSequence woolColor){
        this.weightG = weightG;
        this.eyesColor = eyesColor;
        this.woolColor = woolColor;
        System.out.print("У кошки " + this.eyesColor + " глаза. ");
        System.out.print("Кошка весит " + this.weightG + " грамм. ");
        System.out.println("У кошки " + this.woolColor + " окрас шерсти");
    }
    Cat(int weightG, CharSequence woolColor, long ageYears){
        this.weightG = weightG;
        this.woolColor = woolColor;
        this.ageYears = ageYears;
        System.out.print("Кошке " + this.ageYears + " лет. ");
        System.out.print("Кошка весит " + this.weightG + " грамм. ");
        System.out.println("У кошки " + this.woolColor + " окрас шерсти");
    }
    Cat(int weightG, CharSequence woolColor, String eyesColor){
        this.weightG = weightG;
        this.woolColor = woolColor;
        this.eyesColor = eyesColor;
        System.out.print("У кошки " + this.eyesColor + " глаза. ");
        System.out.print("Кошка весит " + this.weightG + " грамм. ");
        System.out.println("У кошки " + this.woolColor + " окрас шерсти");
    }
    Cat(CharSequence woolColor, long ageYears, String eyesColor){
        this.woolColor = woolColor;
        this.ageYears = ageYears;
        this.eyesColor = eyesColor;
        System.out.print("Кошке " + this.ageYears + " лет. ");
        System.out.print("У кошки " + this.eyesColor + " глаза. ");
        System.out.println("У кошки " + this.woolColor + " окрас шерсти");
    }
    Cat(CharSequence woolColor, long ageYears, int weightG){
        this.woolColor = woolColor;
        this.ageYears = ageYears;
        this.weightG = weightG;
        System.out.print("Кошке " + this.ageYears + " лет. ");
        System.out.print("Кошка весит " + this.weightG + " грамм. ");
        System.out.println("У кошки " + this.woolColor + " окрас шерсти");
    }
    Cat(CharSequence woolColor, String eyesColor, long ageYears){
        this.woolColor = woolColor;
        this.eyesColor = eyesColor;
        this.ageYears = ageYears;
        System.out.print("Кошке " + this.ageYears + " лет. ");
        System.out.print("У кошки " + this.eyesColor + " глаза. ");
        System.out.println("У кошки " + this.woolColor + " окрас шерсти");
    }
    Cat(CharSequence woolColor, String eyesColor, int weightG){
        this.woolColor = woolColor;
        this.eyesColor = eyesColor;
        this.weightG = weightG;
        System.out.print("У кошки " + this.eyesColor + " глаза. ");
        System.out.print("Кошка весит " + this.weightG + " грамм. ");
        System.out.println("У кошки " + this.woolColor + " окрас шерсти");
    }
    Cat(CharSequence woolColor, int weightG, long ageYears){
        this.woolColor = woolColor;
        this.weightG = weightG;
        this.ageYears = ageYears;
        System.out.print("Кошке " + this.ageYears + " лет. ");
        System.out.print("Кошка весит " + this.weightG + " грамм. ");
        System.out.println("У кошки " + this.woolColor + " окрас шерсти");
    }
    Cat(CharSequence woolColor, int weightG, String eyesColor){
        this.woolColor = woolColor;
        this.weightG = weightG;
        this.eyesColor = eyesColor;
        System.out.print("У кошки " + this.eyesColor + " глаза. ");
        System.out.print("Кошка весит " + this.weightG + " грамм. ");
        System.out.println("У кошки " + this.woolColor + " окрас шерсти");
    }

    Cat(long ageYears, String eyesColor, int weightG, CharSequence woolColor){
        this.woolColor = woolColor;
        this.weightG = weightG;
        this.eyesColor = eyesColor;
        this.ageYears = ageYears;
        System.out.print("Кошке " + this.ageYears + " лет. ");
        System.out.print("У кошки " + this.eyesColor + " глаза. ");
        System.out.print("Кошка весит " + this.weightG + " грамм. ");
        System.out.println("У кошки " + this.woolColor + " окрас шерсти");

    }
    Cat(long ageYears, String eyesColor, CharSequence woolColor, int weightG){
        this.woolColor = woolColor;
        this.weightG = weightG;
        this.eyesColor = eyesColor;
        this.ageYears = ageYears;
        System.out.print("Кошке " + this.ageYears + " лет. ");
        System.out.print("У кошки " + this.eyesColor + " глаза. ");
        System.out.print("Кошка весит " + this.weightG + " грамм. ");
        System.out.println("У кошки " + this.woolColor + " окрас шерсти");
    }
    Cat(long ageYears, int weightG, String eyesColor, CharSequence woolColor){
        this.woolColor = woolColor;
        this.weightG = weightG;
        this.eyesColor = eyesColor;
        this.ageYears = ageYears;
        System.out.print("Кошке " + this.ageYears + " лет. ");
        System.out.print("У кошки " + this.eyesColor + " глаза. ");
        System.out.print("Кошка весит " + this.weightG + " грамм. ");
        System.out.println("У кошки " + this.woolColor + " окрас шерсти");
    }
    Cat(long ageYears, int weightG, CharSequence woolColor, String eyesColor){
        this.woolColor = woolColor;
        this.weightG = weightG;
        this.eyesColor = eyesColor;
        this.ageYears = ageYears;
        System.out.print("Кошке " + this.ageYears + " лет. ");
        System.out.print("У кошки " + this.eyesColor + " глаза. ");
        System.out.print("Кошка весит " + this.weightG + " грамм. ");
        System.out.println("У кошки " + this.woolColor + " окрас шерсти");
    }
    Cat(long ageYears, CharSequence woolColor, String eyesColor, int weightG){
        this.woolColor = woolColor;
        this.weightG = weightG;
        this.eyesColor = eyesColor;
        this.ageYears = ageYears;
        System.out.print("Кошке " + this.ageYears + " лет. ");
        System.out.print("У кошки " + this.eyesColor + " глаза. ");
        System.out.print("Кошка весит " + this.weightG + " грамм. ");
        System.out.println("У кошки " + this.woolColor + " окрас шерсти");
    }
    Cat(long ageYears, CharSequence woolColor, int weightG, String eyesColor){
        this.woolColor = woolColor;
        this.weightG = weightG;
        this.eyesColor = eyesColor;
        this.ageYears = ageYears;
        System.out.print("Кошке " + this.ageYears + " лет. ");
        System.out.print("У кошки " + this.eyesColor + " глаза. ");
        System.out.print("Кошка весит " + this.weightG + " грамм. ");
        System.out.println("У кошки " + this.woolColor + " окрас шерсти");
    }
    Cat(String eyesColor, long ageYears, int weightG, CharSequence woolColor){
        this.woolColor = woolColor;
        this.weightG = weightG;
        this.eyesColor = eyesColor;
        this.ageYears = ageYears;
        System.out.print("Кошке " + this.ageYears + " лет. ");
        System.out.print("У кошки " + this.eyesColor + " глаза. ");
        System.out.print("Кошка весит " + this.weightG + " грамм. ");
        System.out.println("У кошки " + this.woolColor + " окрас шерсти");
    }
    Cat(String eyesColor, long ageYears, CharSequence woolColor, int weightG){
        this.woolColor = woolColor;
        this.weightG = weightG;
        this.eyesColor = eyesColor;
        this.ageYears = ageYears;
        System.out.print("Кошке " + this.ageYears + " лет. ");
        System.out.print("У кошки " + this.eyesColor + " глаза. ");
        System.out.print("Кошка весит " + this.weightG + " грамм. ");
        System.out.println("У кошки " + this.woolColor + " окрас шерсти");
    }
    Cat(String eyesColor, int weightG, long ageYears, CharSequence woolColor){
        this.woolColor = woolColor;
        this.weightG = weightG;
        this.eyesColor = eyesColor;
        this.ageYears = ageYears;
        System.out.print("Кошке " + this.ageYears + " лет. ");
        System.out.print("У кошки " + this.eyesColor + " глаза. ");
        System.out.print("Кошка весит " + this.weightG + " грамм. ");
        System.out.println("У кошки " + this.woolColor + " окрас шерсти");
    }
    Cat(String eyesColor, int weightG, CharSequence woolColor, long ageYears){
        this.woolColor = woolColor;
        this.weightG = weightG;
        this.eyesColor = eyesColor;
        this.ageYears = ageYears;
        System.out.print("Кошке " + this.ageYears + " лет. ");
        System.out.print("У кошки " + this.eyesColor + " глаза. ");
        System.out.print("Кошка весит " + this.weightG + " грамм. ");
        System.out.println("У кошки " + this.woolColor + " окрас шерсти");
    }
    Cat(String eyesColor, CharSequence woolColor, long ageYears, int weightG){
        this.woolColor = woolColor;
        this.weightG = weightG;
        this.eyesColor = eyesColor;
        this.ageYears = ageYears;
        System.out.print("Кошке " + this.ageYears + " лет. ");
        System.out.print("У кошки " + this.eyesColor + " глаза. ");
        System.out.print("Кошка весит " + this.weightG + " грамм. ");
        System.out.println("У кошки " + this.woolColor + " окрас шерсти");
    }
    Cat(String eyesColor, CharSequence woolColor, int weightG, long ageYears){
        this.woolColor = woolColor;
        this.weightG = weightG;
        this.eyesColor = eyesColor;
        this.ageYears = ageYears;
        System.out.print("Кошке " + this.ageYears + " лет. ");
        System.out.print("У кошки " + this.eyesColor + " глаза. ");
        System.out.print("Кошка весит " + this.weightG + " грамм. ");
        System.out.println("У кошки " + this.woolColor + " окрас шерсти");
    }
    Cat(int weightG, long ageYears, String eyesColor, CharSequence woolColor){
        this.woolColor = woolColor;
        this.weightG = weightG;
        this.eyesColor = eyesColor;
        this.ageYears = ageYears;
        System.out.print("Кошке " + this.ageYears + " лет. ");
        System.out.print("У кошки " + this.eyesColor + " глаза. ");
        System.out.print("Кошка весит " + this.weightG + " грамм. ");
        System.out.println("У кошки " + this.woolColor + " окрас шерсти");
    }
    Cat(int weightG, long ageYears, CharSequence woolColor, String eyesColor){
        this.woolColor = woolColor;
        this.weightG = weightG;
        this.eyesColor = eyesColor;
        this.ageYears = ageYears;
        System.out.print("Кошке " + this.ageYears + " лет. ");
        System.out.print("У кошки " + this.eyesColor + " глаза. ");
        System.out.print("Кошка весит " + this.weightG + " грамм. ");
        System.out.println("У кошки " + this.woolColor + " окрас шерсти");
    }
    Cat(int weightG, String eyesColor, long ageYears, CharSequence woolColor){
        this.woolColor = woolColor;
        this.weightG = weightG;
        this.eyesColor = eyesColor;
        this.ageYears = ageYears;
        System.out.print("Кошке " + this.ageYears + " лет. ");
        System.out.print("У кошки " + this.eyesColor + " глаза. ");
        System.out.print("Кошка весит " + this.weightG + " грамм. ");
        System.out.println("У кошки " + this.woolColor + " окрас шерсти");
    }
    Cat(int weightG, String eyesColor, CharSequence woolColor, long ageYears){
        this.woolColor = woolColor;
        this.weightG = weightG;
        this.eyesColor = eyesColor;
        this.ageYears = ageYears;
        System.out.print("Кошке " + this.ageYears + " лет. ");
        System.out.print("У кошки " + this.eyesColor + " глаза. ");
        System.out.print("Кошка весит " + this.weightG + " грамм. ");
        System.out.println("У кошки " + this.woolColor + " окрас шерсти");
    }
    Cat(int weightG, CharSequence woolColor, long ageYears, String eyesColor){
        this.woolColor = woolColor;
        this.weightG = weightG;
        this.eyesColor = eyesColor;
        this.ageYears = ageYears;
        System.out.print("Кошке " + this.ageYears + " лет. ");
        System.out.print("У кошки " + this.eyesColor + " глаза. ");
        System.out.print("Кошка весит " + this.weightG + " грамм. ");
        System.out.println("У кошки " + this.woolColor + " окрас шерсти");
    }
    Cat(int weightG, CharSequence woolColor, String eyesColor, long ageYears){
        this.woolColor = woolColor;
        this.weightG = weightG;
        this.eyesColor = eyesColor;
        this.ageYears = ageYears;
        System.out.print("Кошке " + this.ageYears + " лет. ");
        System.out.print("У кошки " + this.eyesColor + " глаза. ");
        System.out.print("Кошка весит " + this.weightG + " грамм. ");
        System.out.println("У кошки " + this.woolColor + " окрас шерсти");
    }
    Cat(CharSequence woolColor, long ageYears, String eyesColor, int weightG){
        this.woolColor = woolColor;
        this.weightG = weightG;
        this.eyesColor = eyesColor;
        this.ageYears = ageYears;
        System.out.print("Кошке " + this.ageYears + " лет. ");
        System.out.print("У кошки " + this.eyesColor + " глаза. ");
        System.out.print("Кошка весит " + this.weightG + " грамм. ");
        System.out.println("У кошки " + this.woolColor + " окрас шерсти");
    }
    Cat(CharSequence woolColor, long ageYears, int weightG, String eyesColor){
        this.woolColor = woolColor;
        this.weightG = weightG;
        this.eyesColor = eyesColor;
        this.ageYears = ageYears;
        System.out.print("Кошке " + this.ageYears + " лет. ");
        System.out.print("У кошки " + this.eyesColor + " глаза. ");
        System.out.print("Кошка весит " + this.weightG + " грамм. ");
        System.out.println("У кошки " + this.woolColor + " окрас шерсти");
    }
    Cat(CharSequence woolColor, String eyesColor, long ageYears, int weightG){
        this.woolColor = woolColor;
        this.weightG = weightG;
        this.eyesColor = eyesColor;
        this.ageYears = ageYears;
        System.out.print("Кошке " + this.ageYears + " лет. ");
        System.out.print("У кошки " + this.eyesColor + " глаза. ");
        System.out.print("Кошка весит " + this.weightG + " грамм. ");
        System.out.println("У кошки " + this.woolColor + " окрас шерсти");
    }
    Cat(CharSequence woolColor, String eyesColor, int weightG, long ageYears){
        this.woolColor = woolColor;
        this.weightG = weightG;
        this.eyesColor = eyesColor;
        this.ageYears = ageYears;
        System.out.print("Кошке " + this.ageYears + " лет. ");
        System.out.print("У кошки " + this.eyesColor + " глаза. ");
        System.out.print("Кошка весит " + this.weightG + " грамм. ");
        System.out.println("У кошки " + this.woolColor + " окрас шерсти");
    }
    Cat(CharSequence woolColor, int weightG, long ageYears, String eyesColor){
        this.woolColor = woolColor;
        this.weightG = weightG;
        this.eyesColor = eyesColor;
        this.ageYears = ageYears;
        System.out.print("Кошке " + this.ageYears + " лет. ");
        System.out.print("У кошки " + this.eyesColor + " глаза. ");
        System.out.print("Кошка весит " + this.weightG + " грамм. ");
        System.out.println("У кошки " + this.woolColor + " окрас шерсти");
    }
    Cat(CharSequence woolColor, int weightG, String eyesColor, long ageYears){
        this.woolColor = woolColor;
        this.weightG = weightG;
        this.eyesColor = eyesColor;
        this.ageYears = ageYears;
        System.out.print("Кошке " + this.ageYears + " лет. ");
        System.out.print("У кошки " + this.eyesColor + " глаза. ");
        System.out.print("Кошка весит " + this.weightG + " грамм. ");
        System.out.println("У кошки " + this.woolColor + " окрас шерсти");
    }

// 65 конструкторов...

}
