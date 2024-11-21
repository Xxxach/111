import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LibraryManager {
    private final Scanner scanner = new Scanner(System.in);
    private final List<Book> books;

    public LibraryManager(List<Book> books) {
        this.books = new ArrayList<>(books);
    }

    // Основной метод управления библиотекой
    public void run() {
        while (true) {
            System.out.println("\nМеню:");
            System.out.println("1. Проверить информацию о книге");
            System.out.println("2. Выдать книгу");
            System.out.println("3. Вернуть книгу");
            System.out.print("Введите номер действия: ");

            try {
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1 -> findAndPrintBook();
                    case 2 -> checkoutBook();
                    case 3 -> returnBook();
                    default -> System.out.println("Неверный выбор. Попробуйте снова.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Ошибка ввода. Пожалуйста, введите число.");
            }
        }
    }

    private void findAndPrintBook() {
        System.out.println("\nВведите название книги (на английском(не мои проблемы)): ");
        String title = scanner.nextLine().toLowerCase();

        for (Book book : books) {
            if (book.getTitle().toLowerCase().contains(title)) {
                book.printInfo();
                return;
            }
        }

        System.out.println("Книга с названием '" + title + "' не найдена.");
    }

    private void checkoutBook() {
        System.out.println("\nВведите название книги: ");
        String title = scanner.nextLine().toLowerCase();

        for (Book book : books) {
            if (book.getTitle().toLowerCase().contains(title)) {
                book.checkOut();
                break;
            }
        }

        System.out.println("Книги с таким названием нет в библиотеке.");
    }

    private void returnBook() {
        System.out.println("\nВведите название книги (на английском(не мои проблемы)): ");
        String title = scanner.nextLine().toLowerCase();

        for (Book book : books) {
            if (book.getTitle().toLowerCase().contains(title)) {
                book.returnBook();
                break;
            }
        }

        System.out.println("Не удалось найти книгу с таким названием.");
    }

    public static void main(String[] args) {
        List<Book> libraryBooks = new ArrayList<>();
        libraryBooks.add(new Book(
                "War and Peace",
                "Лев Толстой",
                true,
                "978-5-17-103783-0",
                1225,
                "Россия" 
        ));
        libraryBooks.add(new Book(
                "Crime and Punishment",
                "Федор Достоевский",
                false,
                "1234567890123",
                800,
                "Россия, Франция"
        ));

        LibraryManager manager = new LibraryManager(libraryBooks);
        manager.run();
    }
} 