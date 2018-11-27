package Dagger2;

import dagger.Module;
import dagger.Provides;

/**
 * Created by vera on 18-11-27.
 */

@Module
public class VehiclesModule {
    @Provides
    public Engine provideEngine(){
        return new Engine();
    }

    @Provides
    public Brand provideBrand(){
        return new Brand("BMW");
    }

}
