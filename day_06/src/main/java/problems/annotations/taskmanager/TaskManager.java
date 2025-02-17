package problems.annotations.taskmanager;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME) //level of annotation source | compile | runtime
@Target({ElementType.TYPE})// FOR CLASS USAGE
@interface MarkPriority{
    int priority() default  0;
    String assignedTo() default "None";
}
@MarkPriority(priority=5,assignedTo="Pankaj")
public class TaskManager  {
    public static void main(String[] args) {
        TaskManager tm = new TaskManager();
        Class<? extends TaskManager> c= tm.getClass();
        MarkPriority an =(MarkPriority) c.getAnnotation(MarkPriority.class);
//        System.out.println(an.annotationType());
        System.out.println("Priority : "+ an.priority());
        System.out.println("AssignedTo : "+ an.assignedTo());

    }
}