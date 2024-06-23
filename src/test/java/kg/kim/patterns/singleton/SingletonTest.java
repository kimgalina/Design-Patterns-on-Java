package kg.kim.patterns.singleton;

import org.junit.jupiter.api.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

import static org.junit.jupiter.api.Assertions.assertSame;

public class SingletonTest {

    @Test
    public void testSingletonInstance() throws InterruptedException {
        int numberOfThreads = 100;
        ExecutorService executorService = Executors.newFixedThreadPool(numberOfThreads);
        AtomicReference<Singleton> singletonReference = new AtomicReference<>();

        for (int i = 0; i < numberOfThreads; i++) {
            executorService.execute(() -> {
                Singleton singleton = Singleton.getInstance();
                if (singletonReference.get() == null) {
                    singletonReference.set(singleton);
                } else {
                    assertSame(singletonReference.get(), singleton);
                }
            });
        }

        executorService.shutdown();
        executorService.awaitTermination(1, TimeUnit.MINUTES);
    }
}
