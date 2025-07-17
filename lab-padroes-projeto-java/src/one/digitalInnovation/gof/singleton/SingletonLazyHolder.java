package one.digitalInnovation.gof;

/**
 * Singleton "Lazy Holder"
 *
 * @author devpedrosena1
 */

public class SingletonLazyHolder {

    private static class InstanceHolder {
        public static SingletonLazyHolder instance = new SingletonLazyHolder();
    }

    private SingletonLazyHolder() {
        super();
    }

    public static SingletonLazyHolder getInstancia() {
        return InstanceHolder.instance;
    }

}
