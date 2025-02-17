package reflection.intermediatelevel.accessandmodifystaticfields;

import java.lang.reflect.Field;

public class Main {

    public static void main(String[] args) throws Exception {
        System.out.println("Before modification:");
        System.out.println(getStaticField(Configuration.class, "API_KEY"));

        ReflectionUtil.modifyStaticField(Configuration.class, "API_KEY", "new_api_key");

        System.out.println("After modification:");
        System.out.println(getStaticField(Configuration.class, "API_KEY"));
    }

    private static String getStaticField(Class<?> clazz, String fieldName) throws NoSuchFieldException, IllegalAccessException {
        Field field = clazz.getDeclaredField(fieldName);
        field.setAccessible(true);
        return (String) field.get(null); // 'null' for static field access
    }
}

