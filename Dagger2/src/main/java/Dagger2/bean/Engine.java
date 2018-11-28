package Dagger2.bean;


import javax.inject.Inject;

/**
 * Created by vera on 18-11-27.
 */

public class Engine {
    Battery battery;

    @Inject
    public Engine(Battery battery) {
        this.battery = battery;
    }

    public void start() {
        System.out.println("Engine started");
    }

    public void stop() {
        System.out.println("Engine stopped");
    }

}
