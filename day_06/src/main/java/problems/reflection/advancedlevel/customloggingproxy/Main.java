package reflection.advancedlevel.customloggingproxy;
public class Main {

    public static void main(String[] args) {
        Greeting greeting = new GreetingImpl();
        Greeting proxyGreeting = (Greeting) ProxyFactory.createProxy(greeting);

        proxyGreeting.sayHello();
    }
}
