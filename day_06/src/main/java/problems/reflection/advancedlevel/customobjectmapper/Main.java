package reflection.advancedlevel.customobjectmapper;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws Exception {
        Map<String, Object> properties = new HashMap<>();
        properties.put("name", "John Doe");
        properties.put("age", 30);

        Person person = ObjectMapper.toObject(Person.class, properties);
        System.out.println(person);
    }
}
