package reflection.beginnerlevel.dynamicallycreateobjects;

import java.lang.reflect.Constructor;

public class Main {

    public static void main(String[] args) {
        try {

            Student s = new Student("Alice",20);
            Class<?> studentClass = s.getClass();
            Constructor<?> constructor = studentClass.getConstructor(String.class, int.class);
            Student student = (Student) s;
            student.display();

        }catch (NoSuchMethodException e) {
            System.out.println("Error: No such constructor.");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Error: Exception occurred while creating the object.");
            e.printStackTrace();
        }
    }
}
