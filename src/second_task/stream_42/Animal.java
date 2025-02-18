package second_task.stream_42;

// Интерфейс Животного
interface Animal {
    void move();
}

// Интерфейс для позвоночных животных
interface Vertebrate {
    Spine getSpine();
}

// Класс Позвоночника
class Spine {
    private String type;

    public Spine(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}

// Класс Шерсти
class Wool {
    private String type;

    public Wool(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}

// Класс Воды (композиция)
class Water {
    private String type;

    public Water(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}

// Абстрактный класс Млекопитающее
abstract class Mammal implements Animal, Vertebrate {
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

// Класс Кошка
class Cat extends Mammal {
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
}

// Класс Медведь
class Bear extends Mammal {
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
}

// Класс Кит
class Whale extends Mammal {
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

// Класс Рыба
class Fish implements Animal {
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
