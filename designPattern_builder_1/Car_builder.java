package designPattern_builder_1;

public class Car_builder implements Builder{

    private String engine;
    private int seats;

    Car_builder(String engine, int seats) {
        this.engine = engine;
        this.seats = seats;
    }

    @Override
    public void reset() {

    }

    @Override
    public void setSeats(int number) {
        this.seats = number;
    }

    @Override
    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getEngine() {
        return engine;
    }

    public int getSeats() {
        return seats;
    }

    @Override
    public void setGPS() {
        System.out.println("Car GPS has been set!");
    }

    public Car build() {
        return new Car(this);
    }

}
