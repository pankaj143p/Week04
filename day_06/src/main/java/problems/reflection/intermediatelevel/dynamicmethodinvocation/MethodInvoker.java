package reflection.intermediatelevel.dynamicmethodinvocation;
import java.lang.reflect.Method;
import java.util.Scanner;

public class MethodInvoker {

    public static void invokeMethod(String methodName, Object obj, Object[] params) throws Exception {
        Method method = obj.getClass().getMethod(methodName, int.class, int.class);
        Object result = method.invoke(obj, params);
        System.out.println("Result: " + result);
    }
}
