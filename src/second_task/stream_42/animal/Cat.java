package second_task.stream_42.animal;

public class Cat extends Mammal {
    private Wool wool;

    public Cat(Wool wool) {
        super("Кошка", "Гибкий кошачий позвоночник");
        this.wool = wool;
    }

    @Override
    public void move() {
        System.out.println(name + " крадется.");
    }

    public Wool getWool() {
        return wool;
    }
}
