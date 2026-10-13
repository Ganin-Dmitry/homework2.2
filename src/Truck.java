public class Truck extends Car implements TrailerTransport {
    public Truck (String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void check () {
        System.out.println("Обслуживаем " + this.getModelName());
        for (int i = 0; i < this.getWheelsCount(); i++) {
            this.updateTyre();
        }
        this.checkEngine();
        this.checkTrailer();
        System.out.println(" ");
    }
}
