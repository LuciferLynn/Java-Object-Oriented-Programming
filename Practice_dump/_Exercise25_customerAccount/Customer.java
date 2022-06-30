package _Exercise25_customerAccount;

public class Customer {

    private int id;
    private String name;
    private char gender;

    public Customer(int Id, String name, char gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return name + "(" + id + ")";
    }
}
