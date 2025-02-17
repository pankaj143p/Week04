package reflection.advancedlevel.dependencyexecution;
public class Main {

    public static void main(String[] args) throws Exception {
        UserService userService = new UserService();
        DIContainer.injectDependencies(userService);
        userService.performService();
    }
}
