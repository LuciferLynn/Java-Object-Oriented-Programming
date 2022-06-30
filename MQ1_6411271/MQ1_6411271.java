package MQ1_6411271;

public class MQ1_6411271 {

    public static void main(String[] args) {
        System.out.println(countRepeatN("hello",2)); // 1
        System.out.println(countRepeatN("123456",1)); // 6
        System.out.println(countRepeatN("xxxabyyyycd",2)); // 5
        System.out.println(countRepeatN("xxxabyyyycd",3)); // 3
        System.out.println(countRepeatN("191233333315aabb",5)); // 2
        System.out.println(countRepeatN("aabbccddeef",2)); // 5
        System.out.println(countRepeatN("aaabbbcccdef",3)); // 3
        System.out.println(countRepeatN("bbnnd",2)); // 2
        System.out.println(countRepeatN("abcdeef",2)); // 1
        System.out.println(countRepeatN("acddef",5)); // 0
    }

    public static int countRepeatN(String inStr, int n) {
        int index2 = 0;
        int count = 0;
        int out = 0;
        int len = inStr.length();

        while(index2 < len){

            for(int i = index2; i < len; i++){

                if(inStr.charAt(i) == inStr.charAt(index2)){

                    count++;

                    if(count == n){
                        out++;
                    }

                }

            }

            index2++;
            count = 0;

        }
        return out;
    }

}
