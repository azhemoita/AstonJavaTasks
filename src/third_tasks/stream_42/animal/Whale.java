package third_tasks.stream_42.animal;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Whale whale)) return false;
        return Objects.equals(water, whale.water) && Objects.equals(name, whale.name) && Objects.equals(spine, whale.spine);
    }

    @Override
    public int hashCode() {
        return Objects.hash(water, name, spine);
    }
}
