package Dagger2;

/**
 * Created by vera on 18-11-27.
 */
public class Main {
    public static void main(String[] args) {
        VehiclesComponent component = DaggerVehiclesComponent.create();
        Car car = component.buildCar();
        car.start();
        car.stop();
        System.out.println("brand is: " + car.carBrand());
    }
}
