package third_tasks.stream_42.animal;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return false;
        if (!(o instanceof Fish fish)) return false;
        return Objects.equals(name, fish.name) && Objects.equals(water, fish.water);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, water);
    }
}
