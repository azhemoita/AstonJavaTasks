package second_task.stream_29.Singleton;

public class Main {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getStaticField();
        Singleton singleton2 = Singleton.getStaticField();

        // Проверка, что оба объекта ссылаются на один и тот же экземпляр
        System.out.println("Are objects equal? - " + (singleton1 == singleton2));
    }
}
