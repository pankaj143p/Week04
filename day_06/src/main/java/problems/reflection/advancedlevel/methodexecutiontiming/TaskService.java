package reflection.advancedlevel.methodexecutiontiming;
public class TaskService {

    public void taskOne() {
        try { Thread.sleep(1000); } catch (InterruptedException e) { e.printStackTrace(); }
    }

    public void taskTwo() {
        try { Thread.sleep(2000); } catch (InterruptedException e) { e.printStackTrace(); }
    }
}
