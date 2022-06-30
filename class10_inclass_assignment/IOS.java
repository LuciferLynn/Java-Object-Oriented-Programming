package class10_inclass_assignment;

public class IOS extends phone implements upgrade, camera{

    IOS(String model, int price, int storage) {
        super(model, price, storage);
    }

    @Override
    public String toString() {
        return super.getModel() + " " +
                super.getPrice() + " " +
                super.getStorage();
    }

    @Override
    public void upgradestorage(int storage_plus) {
        System.out.println("Cannot upgrade storage on IOS!");
    }

    @Override
    public void takephoto() {
        System.out.println("Photo has been taken!");
    }

    @Override
    public void startvideo() {
        System.out.println("Video is now recording!");
    }

    @Override
    public void endvideo() {
        System.out.println("Video recording has ended!");
    }
}
