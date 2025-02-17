package reflection.advancedlevel.customloggingproxy;
import java.lang.reflect.Proxy;

public class ProxyFactory {

    public static Object createProxy(Object target) {
        return Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new LoggingHandler(target)
        );
    }
}
