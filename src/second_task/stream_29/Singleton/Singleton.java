package second_task.stream_29.Singleton;

class Singleton {
    private static Singleton staticField; // Статическое поле

    // Приватный конструктор, чтобы предотвратить создание объектов извне
    private Singleton() {
        System.out.println("Singleton was created");
    }

    // Метод для получения единственного экземпляра класса
    public static Singleton getStaticField() {
        if (staticField == null) {
            staticField = new Singleton();
        }
        return staticField;
    }
}

