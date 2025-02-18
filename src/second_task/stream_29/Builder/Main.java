package second_task.stream_29.Builder;

public class Main {
    public static void main(String[] args) {
        int number = 12241;
        int digit = ((number % 100) / 10) % 10;
        System.out.println(digit);

        // Использование Builder для создания объекта Car
        Car car = new Car.Builder()
                .setBrand("Toyota")
                .setModel("Camry")
                .build();

        System.out.println(car);
    }
}
