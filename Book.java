
public class Book {
    
    String title;
    String author;
    int yearPublished;
    double price;
    
    public Book(String bookName, String authorName, int year, double amount) {
        title = bookName;
        author = authorName;
        yearPublished = year;
        price = amount;
    }
    
    public static void main(String[] args) {
        Book book1 = new Book("Java Programming", "John Smith", 2021, 39.99);
        System.out.println("Book 1:");
        System.out.println("Title: " + book1.title);
        System.out.println("Author: " + book1.author);
        System.out.println("Year Published: " + book1.yearPublished);
        System.out.println("Price: " + book1.price);
        
        Book book2 = new Book("Python Basics", "Jane Doe", 2020, 29.99);
        System.out.println("\nBook 2:");
        System.out.println("Title: " + book2.title);
        System.out.println("Author: " + book2.author);
        System.out.println("Year Published: " + book2.yearPublished);
        System.out.println("Price: " + book2.price);
        
        Book book3 = new Book("C++ Essentials", "Michael Johnson", 2019, 49.99);
        System.out.println("\nBook 3:");
        System.out.println("Title: " + book3.title);
        System.out.println("Author: " + book3.author);
        System.out.println("Year Published: " + book3.yearPublished);
        System.out.println("Price: " + book3.price);
    }
    
}