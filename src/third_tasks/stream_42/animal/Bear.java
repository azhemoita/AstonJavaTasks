package third_tasks.stream_42.animal;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bear bear)) return false;
        return Objects.equals(wool, bear.wool) && Objects.equals(name, bear.name) && Objects.equals(spine, bear.spine);
    }

    @Override
    public int hashCode() {
        return Objects.hash(wool, name, spine);
    }
}
