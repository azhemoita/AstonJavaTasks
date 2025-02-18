package second_task.stream_42;

import second_task.stream_42.animal.*;
import second_task.stream_42.transport.*;

public class Main {
    public static void main(String[] args) {
        Wool catWool = new Wool("Мягкая шерсть");
        Cat cat = new Cat(catWool);
        cat.move();
        System.out.println("Шерсть кошки: " + cat.getWool().getType());

        Wool bearWool = new Wool("Густая шерсть");
        Bear bear = new Bear(bearWool);
        bear.move();
        System.out.println("Медведь имеет шерсть? " + bear.hasWool());

        Water ocean = new Water("Океанская вода");
        Whale whale = new Whale(ocean);
        whale.move();
        System.out.println("Кит живет в воде? " + whale.livesInWater());

        Fish fish = new Fish(ocean);
        fish.move();
        System.out.println("Рыба живет в воде? " + fish.livesInWater());

        System.out.println("****************************");

        TransportSystem system = new TransportSystem();

        system.addVehicle(new Airplane());
        system.addVehicle(new Helicopter());
        system.addVehicle(new Cutter());
        system.addVehicle(new Tanker());
        system.addVehicle(new Truck());
        system.addVehicle(new Taxi());

        system.showAllVehicles();
    }
}
