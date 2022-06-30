package codingbat_JavaString1;

public class makeAbba {

    public static void main(String[] args) {
        System.out.println(makeAbba("Hi", "Bye"));
    }

    public static String makeAbba(String a, String b) {
        return a+b+b+a;
    }

}
