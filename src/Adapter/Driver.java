package Adapter;

public class Driver {
    private Car car;
    public Driver() {}
    public void addCar(Car car) {
        this.car = car;
    }
    public Car getCar() {
        return car;
    }
}
