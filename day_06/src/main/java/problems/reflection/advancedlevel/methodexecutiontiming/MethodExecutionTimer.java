package reflection.advancedlevel.methodexecutiontiming;
import java.lang.reflect.Method;

public class MethodExecutionTimer {

    public static void measureExecutionTime(Object obj, Method method, Object[] args) throws Exception {
        long startTime = System.nanoTime();
        method.invoke(obj, args);
        long endTime = System.nanoTime();
        System.out.println(method.getName() + " execution time: " + (endTime - startTime) + " nanoseconds");
    }
}
