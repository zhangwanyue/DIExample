package Dagger2;

import dagger.Module;
import dagger.Provides;

/**
 * Created by vera on 18-11-27.
 */

// This is an injection module (A module is a class that injects concrete classes for an interface. It allows different modules to inject different kinds of concrete implementations into our code. We need some kind of injection module that injects the Engine and Brand type we need)
@Module
public class VehiclesModule {
    // add the @Provides annotation on methods that construct our dependencies
    @Provides
    public Engine provideEngine(){
        return new Engine();
    }

    @Provides
    public Brand provideBrand(){
        return new Brand("BMW");
    }

}
