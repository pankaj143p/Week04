package reflection.beginnerlevel.invokeprivatemethod;
import java.lang.reflect.Method;

public class ReflectionUtil {

    public static void invokePrivateMethod(Object obj, String methodName, Object[] params) throws Exception {
        Method method = obj.getClass().getDeclaredMethod(methodName, int.class, int.class);
        method.setAccessible(true); // Allow access to private method
        Object result = method.invoke(obj, params);
        System.out.println("Result: " + result);
    }
}
