package class10_inclass_assignment;

public class test {

    public static void main(String[] args) {
        Android android1 = new Android("samsung s21", 2000, 128);
        System.out.println(android1.toString());

        IOS ios1 = new IOS("iphone 13", 3000, 256);
        System.out.println(ios1.toString());

        android1.upgradestorage(64);
        System.out.println(android1.toString());

        ios1.upgradestorage(64);

        android1.takephoto();
        android1.startvideo();
        android1.endvideo();

    }



}
