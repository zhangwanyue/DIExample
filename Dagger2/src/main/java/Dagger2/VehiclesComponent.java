package Dagger2;

import dagger.Component;

/**
 * Created by vera on 18-11-27.
 */
@Component(modules = VehiclesModule.class)
public interface VehiclesComponent {
    public Car buildCar();
}
