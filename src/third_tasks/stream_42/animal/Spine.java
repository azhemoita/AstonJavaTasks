package third_tasks.stream_42.animal;

import java.util.Objects;

public class Spine {
    private String type;

    public Spine(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Spine spine)) return false;
        return Objects.equals(type, spine.type);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(type);
    }
}
