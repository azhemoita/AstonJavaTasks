package second_task.stream_42;

interface Transport {
    void move();
}

abstract class Vehicle implements Transport {
    protected String name;

    public Vehicle(String name) {
        this.name = name;
    }

    public abstract void showProperties();
}

class Airplane extends Vehicle {
    public Airplane() {
        super("Самолет");
    }

    public void move() {
        System.out.println(name + " летит по воздуху.");
    }

    public void showProperties() {
        System.out.println(name + " имеет крылья и колеса.");
    }
}

class Helicopter extends Vehicle {
    public Helicopter() {
        super("Вертолет");
    }

    public void move() {
        System.out.println(name + " летит по воздуху.");
    }

    public void showProperties() {
        System.out.println(name + " имеет винт.");
    }
}

class Truck extends Vehicle {
    public Truck() {
        super("Грузовик");
    }

    public void move() {
        System.out.println(name + " едет по дороге.");
    }

    public void showProperties() {
        System.out.println(name + " возит грузы.");
    }
}
