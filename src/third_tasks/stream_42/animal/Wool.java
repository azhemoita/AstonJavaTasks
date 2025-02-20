package third_tasks.stream_42.animal;

import java.util.Objects;

public class Wool {
    private String type;

    public Wool(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Wool wool)) return false;
        return Objects.equals(type, wool.type);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(type);
    }
}
