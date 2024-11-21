public class Book {
    private String title;
    private String author;
    private boolean isAvailable;
    private String isbn;
    private int pages;
    private String countriesOfPublication;

    // Конструктор
    public Book(String title, String author, boolean isAvailable, String isbn, int pages, String countriesOfPublication) {
        this.title = title;
        this.author = author;
        this.isAvailable = isAvailable;
        this.isbn = isbn;
        this.pages = pages;
        this.countriesOfPublication = countriesOfPublication;
    }

    // Геттеры и сеттеры
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(boolean available) {
        isAvailable = available;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getCountriesOfPublication() {
        return countriesOfPublication;
    }

    public void setCountriesOfPublication(String countriesOfPublication) {
        this.countriesOfPublication = countriesOfPublication;
    }

    // Методы выдачи и возврата книги
    public void checkOut() {
        if (isAvailable()) {
            setIsAvailable(false);
            System.out.println("Книга '" + getTitle() + "' выдана.");
        } else {
            System.out.println("Извините, книга '" + getTitle() + "' уже выдана.");
        }
    }

    public void returnBook() {
        if (!isAvailable()) {
            setIsAvailable(true);
            System.out.println("Книга '" + getTitle() + "' возвращена.");
        } else {
            System.out.println("Книга '" + getTitle() + "' уже доступна.");
        }
    }

    // Метод для вывода информации о книге
    public void printInfo() {
        System.out.println("Название: " + getTitle());
        System.out.println("Автор: " + getAuthor());
        System.out.println("Доступность: " + (isAvailable() ? "Доступна" : "Заимствована"));
        System.out.println("ISBN: " + getIsbn());
        System.out.println("Страниц: " + getPages());
        System.out.println("Страны издания: " + getCountriesOfPublication());
    }
} 