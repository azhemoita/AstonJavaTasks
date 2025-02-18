package second_task.stream_42.animal;

public class Bear extends Mammal {
    private Wool wool;

    public Bear(Wool wool) {
        super("Медведь", "Гибкий и массивный позвоночник");
        this.wool = wool;
    }

    @Override
    public void move() {
        System.out.println(name + " тяжело передвигается.");
    }

    public boolean hasWool() {
        return wool != null;
    }
}
