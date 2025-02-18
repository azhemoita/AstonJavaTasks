package second_task.stream_29.Builder;

class Car {
    // Поля объекта Car
    private String brand;
    private String model;

    // Приватный конструктор для Builder
    private Car(Builder builder) {
        this.brand = builder.brand;
        this.model = builder.model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }

    // Внутренний статический класс Builder
    public static class Builder {
        private String brand;
        private String model;

        public Builder setBrand(String brand) {
            this.brand = brand;
            return this;
        }

        public Builder setModel(String model) {
            this.model = model;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }
}
