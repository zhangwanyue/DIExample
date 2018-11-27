package Dagger2;

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


        VehiclesModule vehiclesModule1 = new VehiclesModule();
        // 以下是DaggerVehiclesComponent.create()的实际内部代码
        DaggerVehiclesComponent.Builder builder1 = DaggerVehiclesComponent.builder();
        builder1 = builder1.vehiclesModule(vehiclesModule1); //将vehiclesModule1放入builder1中，相当于set vehiclesModule1
        VehiclesComponent component1 = builder1.build(); //使用builder1构建一个DaggerVehiclesComponent，实际上builder里面就是new DaggerVehiclesComponent(builder1)
        Car car1 = component1.buildCar();
        car1.start();
        car1.stop();


        VehiclesModule vehiclesModule2 = new VehiclesModule();
        // dagger自动为@inject的元素和对应的inject module一同创建一个工厂类，比如：Car类中被inject了Engine类和Brand类，dagger为Engine构建了一个VehiclesModule_ProvideEngineFactory
        // @Provide注释的类，比如：provideEngine()，会被放入工厂类中，成为proxyProvideEngine()
        // 以下是component.buildCar()的实际内部代码
        Car car2 = new Car(VehiclesModule_ProvideEngineFactory.proxyProvideEngine(vehiclesModule2),
                        VehiclesModule_ProvideBrandFactory.proxyProvideBrand(vehiclesModule2));
        car2.start();
        car2.stop();


        VehiclesModule vehiclesModule3 = new VehiclesModule();
        // 以下是VehiclesModule_ProvideEngineFactory.proxyProvideEngine(vehiclesModule1)的实际内部代码
        Car car3 = new Car(vehiclesModule3.provideEngine(), vehiclesModule3.provideBrand());
        car3.start();
        car3.stop();


    }
}
