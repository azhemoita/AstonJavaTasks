package second_task.stream_42.transport;

public class Airplane extends Vehicle {
    private final Wheels wheels = new Wheels();
    private final Propeller propeller = new Propeller();
    private final CargoCapability cargo = new CargoCapability();
    private final Wings wings = new Wings();

    public Airplane() {
        super("Самолёт");
    }

    @Override
    public void move() {
        System.out.println(name + " летит по воздуху.");
    }

    @Override
    public void showProperties() {
        wings.spread();
        wheels.roll();
        propeller.spin();
        cargo.carryCargo();
    }
}
