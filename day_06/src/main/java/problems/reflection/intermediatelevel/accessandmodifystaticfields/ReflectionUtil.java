package reflection.intermediatelevel.accessandmodifystaticfields;
import java.lang.reflect.Field;

public class ReflectionUtil {

    public static void modifyStaticField(Class<?> clazz, String fieldName, Object newValue) throws NoSuchFieldException, IllegalAccessException {
        Field field = clazz.getDeclaredField(fieldName);
        field.setAccessible(true); // Ensures access to private field
        field.set(null, newValue); // 'null' because it's a static field
    }
}

