package Dagger2;

import Dagger2.bean.Car;
import dagger.Component;

/**
 * Created by vera on 18-11-27.
 */

// A component is an interface that specifies which modules to use and what objects to return for our code.(Here the used module is VehiclesModule and the returned object is car)
// Component interface. This is the class that will generate Car instances, injecting dependencies provided by VehiclesModule.
@Component(modules = VehiclesModule.class)
public interface VehiclesComponent {
    public Car buildCar();
}
