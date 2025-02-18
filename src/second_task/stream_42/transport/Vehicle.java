package second_task.stream_42.transport;

public abstract class Vehicle implements Transport {
    protected String name;

    protected Vehicle(String name) {
        this.name = name;
    }

    public abstract void showProperties();
}
