package day3;
public class book {
    private String name;
    private author author;
    private double price;
    private int qtyInStock;

    // Parameterized Constructor
    public book(String name, author author, double price, int qtyInStock) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qtyInStock = qtyInStock;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public author getAuthor() {
        return author;
    }

    public void setAuthor(author author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQtyInStock() {
        return qtyInStock;
    }

    public void setQtyInStock(int qtyInStock) {
        this.qtyInStock = qtyInStock;
    }

    // toString method for printing
    @Override
    public String toString() {
        return "book [Title: " + name + ", Price: " + price + ", Quantity: " + qtyInStock + ", " + author.toString() + "]";
    }
}

