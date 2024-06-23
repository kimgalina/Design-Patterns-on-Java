package kg.kim.patterns.singleton;

public class Main {
    public static void main(String[] args) {

        // проверяем на многопоточной среде
        Thread1 th1 = new Thread1();
        Thread2 th2 = new Thread2();
        th1.start();
        th2.start();
    }
}
