package class2;

public class StringTokenization {

    public static void main(String[] args) {

        Integer num = 3;
        String names = "Hibana,Echo,Nokk";
        String namesArray[] = {};
        namesArray = names.split(",");

        for (int i = 0; i < num; i++) {
            System.out.println(namesArray[i]);
        }



    }

}
