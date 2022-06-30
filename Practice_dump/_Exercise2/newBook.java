package _Exercise2;

import java.util.Arrays;

public class newBook {

    private String name;
    private Author[] authors;
    private double price;
    private int qty = 0;


    newBook(String name, Author[] authors, Double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    newBook(String name, Author[] authors, Double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author[] getAuthors() {
        return authors;
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
        return "newBook{" +
                "name='" + name + '\'' +
                ", authors=" + Arrays.toString(authors) +
                ", price=" + price +
                ", qty=" + qty +
                '}';
    }

    public String getAuthorNames() {
        String out = "";
        for (Author author: authors) {
            out += author.getName() + ", ";
        }
        return out.substring(0, out.length()-1);
    }

}
