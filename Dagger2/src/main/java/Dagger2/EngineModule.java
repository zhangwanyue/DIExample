package Dagger2;

import Dagger2.bean.Battery;
import dagger.Module;
import dagger.Provides;

/**
 * Created by vera on 18-11-27.
 */

@Module
public class EngineModule {
    @Provides
    public Battery provideBattery(){
        return new Battery(100, 2000);
    }
}
