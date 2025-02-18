package second_task.stream_42.transport;

public class Tanker extends Vehicle {
    private final Propeller propeller;
    private final CargoCapability cargo;

    public Tanker() {
        super("Танкер");
        this.propeller = new Propeller();
        this.cargo = new CargoCapability();
    }

    @Override
    public void move() {
        System.out.println(name + " плывёт по воде.");
    }

    @Override
    public void showProperties() {
        propeller.spin();
        cargo.carryCargo();
    }
}
