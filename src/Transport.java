public abstract class Transport {

    private String modelName;
    private int wheelsCount;

    public Transport (String modelName, int wheelsCount) {
        this.setModelName(modelName);
        this.setWheelsCount(wheelsCount);
    }

    public int getWheelsCount () {
        return wheelsCount;
    }

    public String getModelName () {
        return modelName;
    }

    public void setModelName (String modelName) {
        this.modelName = modelName;
    }

    public void setWheelsCount (int wheelsCount) {
        this.wheelsCount = wheelsCount;
    }

    public void check () {
        System.out.println("Проверяем работоспособность транспорта");
    }

}
