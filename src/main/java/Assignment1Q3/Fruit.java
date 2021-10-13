package Assignment1Q3;

public interface Fruit {
    default void hasAPeel() {
        System.out.println("This is printing from default hasAPeel function");
    }
}
