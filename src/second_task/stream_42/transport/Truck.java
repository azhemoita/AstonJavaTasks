package second_task.stream_42.transport;

public class Truck extends Vehicle {
    private final Wheels wheels;
    private final CargoCapability cargo;

    public Truck() {
        super("Грузовик");
        this.wheels = new Wheels();
        this.cargo = new CargoCapability();
    }

    @Override
    public void move() {
        System.out.println(name + " едет по дороге.");
    }

    @Override
    public void showProperties() {
        wheels.roll();
        cargo.carryCargo();
    }
}
