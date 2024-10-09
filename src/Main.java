import one.digitalinnovation.gof.facade.Facade;
import one.digitalinnovation.gof.singleton.SingletonEager;
import one.digitalinnovation.gof.singleton.SingletonLazy;
import one.digitalinnovation.gof.singleton.SingletonLazyHolder;
import one.digitalinnovation.gof.strategy.*;

public class Main {
    public static void main(String[] args) {

        // Design Pattern Singleton
        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println("Singleton Lazy without \"instancia\": " + lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println("Singleton Lazy with \"instancia\": " + lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println("Singleton Eager without \"instancia\": " + eager);
        eager = SingletonEager.getInstancia();
        System.out.println("Singleton Lazy with \"instancia\": " + eager);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println("Singleton Lazy Holder without \"instancia\": " + lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println("Singleton Lazy Holder with \"instancia\": " + lazyHolder);

        // Design Pattern Strategy
        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();
        robo.mover();
        robo.setComportamento(defensivo);
        robo.mover();
        robo.setComportamento(agressivo);
        robo.mover();
        robo.mover();
        robo.mover();

        // Design Pattern Facade
        Facade facade = new Facade();
        facade.migrarCliente("Bruno", "13320070");
    }
}