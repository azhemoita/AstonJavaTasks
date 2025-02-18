package first_task.stream_29;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
        public static void main(String[] args) {
            List<Student> students = List.of(
                    new Student("Alice", new ArrayList<>(Arrays.asList(
                            new Book("Book1", 300, 1999),
                            new Book("Book2", 150, 2005),
                            new Book("Book3", 200, 2010),
                            new Book("Book4", 400, 2001),
                            new Book("Book5", 350, 1998)
                    ))),
                    new Student("Bob", new ArrayList<>(Arrays.asList(
                            new Book("Book6", 300, 1999),
                            new Book("Book7", 250, 2004),
                            new Book("Book8", 100, 2012),
                            new Book("Book2", 150, 2005),
                            new Book("Book9", 350, 2000)
                    ))),
                    new Student("Charlie", new ArrayList<>(Arrays.asList(
                            new Book("Book10", 500, 2015),
                            new Book("Book11", 300, 2003),
                            new Book("Book12", 200, 2007),
                            new Book("Book1", 300, 1999),
                            new Book("Book13", 400, 1995)
                    )))
            );

            // 3.1. Вывести в консоль каждого студента
            students.stream()
                    .peek(System.out::println)

                    // 3.2. Получить для каждого студента список книг
                    .flatMap(student -> student.getBooks().stream())

                    // 3.3. Получить книги
                    .distinct()

                    // 3.4. Отсортировать книги по количеству страниц
                    .sorted(Comparator.comparingInt(Book::getPages))

                    // 3.5. Оставить только уникальные книги
                    .distinct()

                    // 3.6. Отфильтровать книги, оставив только те, которые были выпущены после 2000 года
                    .filter(book -> book.getYear() > 2000)

                    // 3.7. Ограничить стрим на 3 элементах
                    .limit(3)

                    // 3.8. Получить из книг годы выпуска
                    .map(Book::getYear)

                    // 3.9. При помощи методов короткого замыкания вернуть Optional от книги
                    .findFirst()

                    // 3.10. При помощи методов получения значения из Optional вывести в консоль год выпуска найденной книги, либо запись о том, что такая книга отсутствует
                    .ifPresentOrElse(
                            year -> System.out.println("Found book year: " + year),
                            () -> System.out.println("No book found")
                    );
        }
}
