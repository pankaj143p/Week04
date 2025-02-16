package java.org.junit.basic;

import java.util.concurrent.TimeUnit;

public class PerformanceTest {
    public static String longRunningTask() throws InterruptedException {
        TimeUnit.SECONDS.sleep(3);
        return "Completed";
    }
}

