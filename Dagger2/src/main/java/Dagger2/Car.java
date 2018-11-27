package Dagger2;

import javax.inject.Inject;

/**
 * Created by vera on 18-11-27.
 */
public class Car {
    private Engine engine;
    private Brand brand;

    @Inject
    public Car(Engine engine, Brand brand) {
        this.engine = engine;
        this.brand = brand;
    }

    public void start(){
        this.engine.start();
    }

    public void stop(){
        this.engine.stop();
    }

    public String carBrand(){
        return this.brand.getName();
    }

}
