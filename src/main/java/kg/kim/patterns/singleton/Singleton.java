package kg.kim.patterns.singleton;

public class Singleton {

    private static volatile Singleton instance;

    private Singleton(){} // скрытый конструктор

    public static Singleton getInstance() {
        if(instance == null) {
           synchronized (Singleton.class) { // гарантирует что доступ ко всему что в классе Singleton будет только у одного потока
               if(instance == null) {
                   instance = new Singleton();
               }
           }
        }
        return instance;
    }
}
