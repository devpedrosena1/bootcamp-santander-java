package one.digitalInnovation.gof.singleton;

/**
 * Singleton "Apressado"
 * @author devpedrosena1
 */

public class SingletonEager {

    private static SingletonEager instancia = new SingletonEager();

    private SingletonEager() {
        super();
    }

    public static SingletonEager getInstancia() {
        return instancia;
    }

}
