package Dagger2;

import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DaggerVehiclesComponent implements VehiclesComponent {
  private VehiclesModule vehiclesModule;

  private DaggerVehiclesComponent(Builder builder) {
    initialize(builder);
  }

  public static Builder builder() {
    return new Builder();
  }

  public static VehiclesComponent create() {
    return new Builder().build();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {
    this.vehiclesModule = builder.vehiclesModule;
  }

  @Override
  public Car buildCar() {
    return new Car(
        VehiclesModule_ProvideEngineFactory.proxyProvideEngine(vehiclesModule),
        VehiclesModule_ProvideBrandFactory.proxyProvideBrand(vehiclesModule));
  }

  public static final class Builder {
    private VehiclesModule vehiclesModule;

    private Builder() {}

    public VehiclesComponent build() {
      if (vehiclesModule == null) {
        this.vehiclesModule = new VehiclesModule();
      }
      return new DaggerVehiclesComponent(this);
    }

    public Builder vehiclesModule(VehiclesModule vehiclesModule) {
      this.vehiclesModule = Preconditions.checkNotNull(vehiclesModule);
      return this;
    }
  }
}
