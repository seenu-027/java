package day3;
public class main {
    public static void main(String[] args) {
        // Creating an Author object
        author author = new author("Abhilash", "abhilash@example.com", 'M');

        // Creating a Book object with the Author
        book book = new book("Learning Java", author, 499.99, 10);

        // Printing book details
        System.out.println(book.toString());
    }
}
