package class2;

public class StringProcessing1 {

    public static void main(String[] args) {
        System.out.println();

        String str = "Hello World!";
        System.out.println("The length of " + str + " is "  + str.length());

        char at4 = '4';
        System.out.println(str.charAt(4));

        String greeting = "Good morning";
        String name = "Lynn";
        String result =  greeting.concat(" ").concat(name); // chain calling
        System.out.println(result);

        String hello = str.substring(0,5); // index 0<i<5
        System.out.println(hello);

        String world = str.substring(6,11); // index 6<i<11
        System.out.println(world);

        String noVowels = str.replace('o','*');
        System.out.println(noVowels);

        String toBeTrimmed = "  This is a sentence  ";
        System.out.println(toBeTrimmed.trim());

    }

}
