package patternSingleton;

public class Singleton {
    private static final Singleton instance;
    private int compteur;

    static {
        instance = new Singleton();
    }
    private Singleton() {
        System.out.println("*********** Instanciation du Singleton");
    }

    public static Singleton getInstance() {
        return instance;
    }

    public void doSomething(String task) {
        System.out.println("******** doing " +task);

        for (int i = 1; i<5; i++) {
            ++compteur;
            System.out.println("...." + compteur);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("End of the process : " + task + ", " + "  compteur : " + compteur);
    }
}
