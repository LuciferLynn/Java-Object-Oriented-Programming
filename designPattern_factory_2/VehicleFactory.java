package designPattern_factory_2;

public class VehicleFactory {
    public static Vehicle getVehicle(String brand, String model, String engine, int enginePower) {
        if (brand == "BMW") {
            return new BMW(model, engine, enginePower);
        } else if (brand == "Suzuki") {
            return new Suzuki(model, engine, enginePower);
        }
        return null;
    }
}
