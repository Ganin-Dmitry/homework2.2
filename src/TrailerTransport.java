public interface TrailerTransport {
    default public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
}
