package class10_inclass_assignment;

public abstract class phone implements upgrade {

    // 1. Data members
    private String model;
    private int price;
    private int storage;

    // 2. Constructors
    phone(String model, int price, int storage) {
        this.model = model;
        this.price = price;
        this.storage = storage;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }
}
