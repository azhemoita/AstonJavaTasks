package second_task.stream_42.transport;

public class Taxi extends Vehicle {
    private final Wheels wheels;

    public Taxi() {
        super("Такси");
        this.wheels = new Wheels();
    }

    @Override
    public void move() {
        System.out.println(name + " едет по дороге.");
    }

    @Override
    public void showProperties() {
        wheels.roll();
    }
}
