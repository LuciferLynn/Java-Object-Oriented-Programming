package _Exercise2;

public class Book {

    private String name;
    private Author author;
    private double price;
    private int qty = 0;

    Book(String name, Author author, Double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    Book(String name, Author author, Double price, int qty) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author=" + author.toString() +
                ", price=" + price +
                ", qty=" + qty +
                '}';
    }
}
