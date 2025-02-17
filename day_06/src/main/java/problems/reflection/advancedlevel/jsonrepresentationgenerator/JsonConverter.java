package reflection.advancedlevel.jsonrepresentationgenerator;
import java.lang.reflect.Field;

public class JsonConverter {

    public static String toJson(Object obj) throws IllegalAccessException {
        StringBuilder json = new StringBuilder();
        json.append("{");

        Field[] fields = obj.getClass().getDeclaredFields();
        for (int i = 0; i < fields.length; i++) {
            fields[i].setAccessible(true);
            json.append("\"")
                    .append(fields[i].getName())
                    .append("\": \"")
                    .append(fields[i].get(obj))
                    .append("\"");

            if (i < fields.length - 1) {
                json.append(", ");
            }
        }

        json.append("}");
        return json.toString();
    }
}
