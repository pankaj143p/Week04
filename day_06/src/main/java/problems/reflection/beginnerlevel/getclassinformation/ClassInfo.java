package problems.reflection.beginnerlevel.getclassinformation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;

public class ClassInfo {

    public static void displayClassInfo(String className) {
        try {
            // Load the class dynamically using the fully qualified class name
            Class<?> clazz = Class.forName(className);

            // Displaying the class name
            System.out.println("Class: " + clazz.getName());

            // Displaying methods
            System.out.println("\nMethods:");
            Method[] methods = clazz.getDeclaredMethods();
            for (Method method : methods) {
                System.out.println(method.getName());
            }

            // Displaying fields
            System.out.println("\nFields:");
            Field[] fields = clazz.getDeclaredFields();
            for (Field field : fields) {
                System.out.println(field.getName());
            }

            // Displaying constructors
            System.out.println("\nConstructors:");
            Constructor<?>[] constructors = clazz.getDeclaredConstructors();
            for (Constructor<?> constructor : constructors) {
                System.out.println(constructor.getName());
            }

        } catch (ClassNotFoundException e) {
            System.out.println("Class not found: " + className);
        }
    }
}
