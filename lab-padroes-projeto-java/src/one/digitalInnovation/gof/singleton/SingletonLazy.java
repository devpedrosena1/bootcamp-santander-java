package one.digitalInnovation.gof;

/**
 * Singleton "Preguiçoso"
 * @author devpedrosena1
 */

public class SingletonLazy {

    private static SingletonLazy instancia;

    private SingletonLazy() {
        super();
    }

    public static SingletonLazy getInstancia() {
        if (instancia == null){
            instancia = new SingletonLazy();
        }
        return instancia;
    }

}
