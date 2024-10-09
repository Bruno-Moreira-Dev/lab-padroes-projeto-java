import one.digitalinnovation.gof.SingletonEager;
import one.digitalinnovation.gof.SingletonLazy;
import one.digitalinnovation.gof.SingletonLazyHolder;

public class Main {
    public static void main(String[] args) {
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
    }
}