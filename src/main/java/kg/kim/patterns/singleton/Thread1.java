package kg.kim.patterns.singleton;

public class Thread1 implements Runnable{

    private Thread thread;

    @Override
    public void run() {
        for(int i = 10; i > 0; i--) {
            Singleton singleton = Singleton.getInstance();
            System.out.println(singleton);
        }

    }

    public Thread1() {
        thread = new Thread(this);
    }

    public void start() {
        thread.start();
    }

}
