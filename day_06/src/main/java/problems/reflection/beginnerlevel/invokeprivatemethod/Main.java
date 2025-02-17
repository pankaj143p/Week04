package reflection.beginnerlevel.invokeprivatemethod;
public class Main {

    public static void main(String[] args) throws Exception {
        Calculator calculator = new Calculator();
        Object[] params = {5, 4};

        ReflectionUtil.invokePrivateMethod(calculator, "multiply", params);
    }
}
