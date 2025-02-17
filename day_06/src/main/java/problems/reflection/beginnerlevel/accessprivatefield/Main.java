package reflection.beginnerlevel.accessprivatefield;
public class Main {

    public static void main(String[] args) throws Exception {
        Person person = new Person(25);

        // Retrieve the initial value of the private field 'age'
        System.out.println("Initial age: " + ReflectionUtil.getPrivateField(person, "age"));

        // Modify the private field 'age'
        ReflectionUtil.setPrivateField(person, "age", 30);

        // Retrieve the modified value of the private field 'age'
        System.out.println("Modified age: " + ReflectionUtil.getPrivateField(person, "age"));
    }
}
