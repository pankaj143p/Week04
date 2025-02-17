package reflection.beginnerlevel.accessprivatefield;
import java.lang.reflect.Field;

public class ReflectionUtil {

    public static void setPrivateField(Object obj, String fieldName, Object value) throws NoSuchFieldException, IllegalAccessException {
        Field field = obj.getClass().getDeclaredField(fieldName);
        field.setAccessible(true); // Make private field accessible
        field.set(obj, value); // Set the value of the field
    }

    public static Object getPrivateField(Object obj, String fieldName) throws NoSuchFieldException, IllegalAccessException {
        Field field = obj.getClass().getDeclaredField(fieldName);
        field.setAccessible(true); // Make private field accessible
        return field.get(obj); // Get the value of the field
    }
}
