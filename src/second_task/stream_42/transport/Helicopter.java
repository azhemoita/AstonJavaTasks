package second_task.stream_42.transport;

public class Helicopter extends Vehicle {
    private final Wheels wheels;
    private final Propeller propeller;
    private final CargoCapability cargo;

    public Helicopter() {
        super("Вертолёт");
        this.wheels = new Wheels();
        this.propeller = new Propeller();
        this.cargo = new CargoCapability();
    }

    @Override
    public void move() {
        System.out.println(name + " летит по воздуху.");
    }

    @Override
    public void showProperties() {
        wheels.roll();
        propeller.spin();
        cargo.carryCargo();
    }
}
