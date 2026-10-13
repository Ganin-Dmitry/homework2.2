public class Main {
    public static void main(String[] args) {
        Car car = new Car("Приора", 4);
        Car car2 = new Car("Dodge Challenger", 4);

        Truck truck = new Truck("Газель", 6);
        Truck truck2 = new Truck("Камаз", 6);

        Bicycle bicycle = new Bicycle("Школьник", 3);
        Bicycle bicycle2 = new Bicycle("Stels", 2);

        bicycle.check();
        bicycle2.check();
        truck.check();
        truck2.check();
        car.check();
        car2.check();
    }
}