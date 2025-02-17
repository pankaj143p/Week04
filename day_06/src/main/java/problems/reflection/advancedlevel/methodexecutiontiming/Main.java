package reflection.advancedlevel.methodexecutiontiming;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) throws Exception {
        TaskService taskService = new TaskService();

        Method taskOneMethod = TaskService.class.getMethod("taskOne");
        Method taskTwoMethod = TaskService.class.getMethod("taskTwo");

        MethodExecutionTimer.measureExecutionTime(taskService, taskOneMethod, null);
        MethodExecutionTimer.measureExecutionTime(taskService, taskTwoMethod, null);
    }
}
