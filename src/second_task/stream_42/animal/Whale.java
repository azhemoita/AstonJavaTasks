package second_task.stream_42.animal;

public class Whale extends Mammal {
    private Water water;

    public Whale(Water water) {
        super("Кит", "Гибкий для плавания позвоночник");
        this.water = water;
    }

    @Override
    public void move() {
        System.out.println(name + " плавает.");
    }

    public boolean livesInWater() {
        return water != null;
    }
}
