package third_tasks.stream_42.animal;

import java.util.Objects;

public class Water {
    private String type;

    public Water(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Water water)) return false;
        return Objects.equals(type, water.type);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(type);
    }
}
