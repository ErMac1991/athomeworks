package HW247.Task6;

public class Timer {
    static int seconds; // - общее число секунд, устанавливается в конструкторе

    Timer(int seconds){
        this.seconds = seconds;
    }

    public static void waitSecond() throws InterruptedException { // - метод реализует паузу одной секунды. Реализовать с помощью цикла.
        Thread.sleep(1000);
    }

    public static void printTime(int seconds) {   // вывода оставшегося времени в минутах и секундах.
        System.out.format("%02d:%02d\n",(seconds/60),(seconds%60));
    }

    public static void start(Timer timer) throws InterruptedException { // объектный - запускает обратный отсчет и каждую секунды выводит оставшееся количество секунд.
        for (int i = timer.seconds; i >= 0; i--){
            waitSecond();
            printTime(i);

        }
    }
}
