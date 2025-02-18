package second_task.stream_42.animal;

public class Fish implements Animal {
    private String name;
    private Water water;

    public Fish(Water water) {
        this.name = "Рыба";
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
