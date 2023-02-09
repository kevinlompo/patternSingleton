package patternSingleton;

public class Application {
    public static void main(String[] args) {

        for (int i = 1; i<5; i++) {
            Singleton sn = Singleton.getInstance();
            sn.doSomething("Task " +i);
        }
    }
}
