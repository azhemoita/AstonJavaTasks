package first_task.stream_29;
import java.util.*;

class Student {
    private String name;
    private List<Book> books;

    public Student(String name, List<Book> books) {
        this.name = name;
        this.books = books;
    }

    public List<Book> getBooks() {
        return books;
    }

    @Override
    public String toString() {
        return "Student name: " + name +
                ", books: " + books;
    }
}

