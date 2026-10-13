public interface WheeledTransport {
    default void updateTyre() {
        System.out.println("Меняем покрышку");
    }
}
