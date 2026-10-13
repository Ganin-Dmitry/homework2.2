public interface MotorTransport {
    default public void checkEngine () {
        System.out.println("Проверяем двигатель");
    }
}
