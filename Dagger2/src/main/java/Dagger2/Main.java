package Dagger2;

import Dagger2.bean.Battery;
import Dagger2.bean.Car;
import Dagger2.bean.Engine;

/**
 * Created by vera on 18-11-27.
 */
public class Main {
    public static void main(String[] args) {
        // Dagger 2 generates a class with the same name as our component class, prefixed with "Dagger" when our project is compiled.
        VehiclesComponent component = DaggerVehiclesComponent.create();
        Car car = component.buildCar();
        car.start();
        car.stop();
        System.out.println("brand is: " + car.carBrand());

/*
        VehiclesModule vehiclesModule1 = new VehiclesModule();
        EngineModule engineModule1 = new EngineModule();
        // 以下是DaggerVehiclesComponent.create()的实际内部代码
        DaggerVehiclesComponent.Builder builder1 = DaggerVehiclesComponent.builder();
        builder1 = builder1.vehiclesModule(vehiclesModule1); //将vehiclesModule1放入builder1中，相当于set vehiclesModule1
        builder1 = builder1.engineModule(engineModule1);
        VehiclesComponent component1 = builder1.build(); //使用builder1构建一个DaggerVehiclesComponent，实际上builder里面就是new DaggerVehiclesComponent(builder1)
        Car car1 = component1.buildCar();
        car1.start();
        car1.stop();


        Battery battery2 = new Battery(100, 1000);
        VehiclesModule vehiclesModule2 = new VehiclesModule();
        // dagger自动为inject module中provide的类创建一个工厂类，比如：VehiclesModule中provide了Engine和Brand类，dagger为他们构建了VehiclesModule_ProvideEngineFactory和VehiclesModule_ProvideBrandFactory
        // EngineModule中provide了Battery类，dagger为其创建了一个EngineModule_ProvideBatteryFactory
        // @Provide注释的方法，比如：provideEngine()，会被放入工厂类中，成为proxyProvideEngine()，该工厂类在生成实例的过程中会实际调用EngineModule.provideBattery()，构造出Battery实例
        // 以下是component.buildCar()的实际内部代码
        Car car2 = new Car(VehiclesModule_ProvideEngineFactory.proxyProvideEngine(vehiclesModule2, battery2),
                        VehiclesModule_ProvideBrandFactory.proxyProvideBrand(vehiclesModule2));
        car2.start();
        car2.stop();


        Battery battery3 = new Battery(100, 1000);
        VehiclesModule vehiclesModule3 = new VehiclesModule();
        // 以下是VehiclesModule_ProvideEngineFactory.proxyProvideEngine(vehiclesModule1)的实际内部代码
        Car car3 = new Car(vehiclesModule3.provideEngine(battery3), vehiclesModule3.provideBrand());
        car3.start();
        car3.stop();
*/

    }
}
