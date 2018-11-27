package Dagger2;

import javax.inject.Inject;

/**
 * Created by vera on 18-11-27.
 */
public class Car {
    private Engine engine;
    private Brand brand;

    // Dagger uses the standard JSR-330 annotations in many places, one being @Inject.
    // We can add the annotations to fields or the constructor. But, since Dagger doesn’t support injection on private fields, we’ll go for constructor injection to preserve encapsulation:
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
