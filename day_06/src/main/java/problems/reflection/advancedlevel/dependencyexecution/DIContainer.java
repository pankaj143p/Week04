package reflection.advancedlevel.dependencyexecution;
import java.lang.reflect.Field;

public class DIContainer {

    public static void injectDependencies(Object obj) throws IllegalAccessException {
        Class<?> clazz = obj.getClass();
        Field[] fields = clazz.getDeclaredFields();

        for (Field field : fields) {
            if (field.isAnnotationPresent(Inject.class)) {
                field.setAccessible(true);
                Class<?> fieldType = field.getType();
                try {
                    Object dependency = fieldType.getDeclaredConstructor().newInstance();
                    field.set(obj, dependency);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
