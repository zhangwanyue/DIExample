package Dagger2;

import Dagger2.bean.Battery;
import Dagger2.bean.Brand;
import Dagger2.bean.Engine;
import dagger.Module;
import dagger.Provides;

/**
 * Created by vera on 18-11-27.
 */

// Modules encapsulate knowledge of how to construct the objects you want to inject. This knowledge is defined in a module class, which have methods annotated by @Provides annotation. Returned type in this methods is the type which you want to inject.
// Moreover, knowledge aggregated in modules can be used in modules itself.
// This is an injection module (A module is a class that injects concrete classes for an interface. It allows different modules to inject different kinds of concrete implementations into our code. We need some kind of injection module that injects the Engine and Brand type we need)
@Module(includes = EngineModule.class)
public class VehiclesModule {
    // add the @Provides annotation on methods that construct our dependencies
    @Provides
    public Engine provideEngine(Battery battery){
        return new Engine(battery);
    }

    @Provides
    public Brand provideBrand(){
        return new Brand("BMW");
    }

}
