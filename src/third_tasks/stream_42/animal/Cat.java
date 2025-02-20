package third_tasks.stream_42.animal;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cat cat)) return false;
        return Objects.equals(wool, cat.wool) && Objects.equals(name, cat.name) && Objects.equals(spine, cat.spine);
    }

    @Override
    public int hashCode() {
        return Objects.hash(wool, name, spine);
    }
}
