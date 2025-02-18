package second_task.stream_42.animal;

public abstract class Mammal implements Animal, Vertebrate {
    protected String name;
    protected Spine spine;

    public Mammal(String name, String spineType) {
        this.name = name;
        this.spine = new Spine(spineType);
    }

    @Override
    public Spine getSpine() {
        return spine;
    }
}
