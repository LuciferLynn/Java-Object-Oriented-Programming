package _midterm_prep2;

public class MQ1_6411271 {

    public static void main(String[] args) {
        System.out.println(countRepeatN("hello", 2));
        System.out.println(countRepeatN("191233333315aabb", 5));
    }

    public static int countRepeatN(String inStr, int n) {
        int staticIndex = 0;
        int count = 0;
        int out = 0;
        int len = inStr.length();

        while(staticIndex < len){
            for(int i = staticIndex; i < len; i++){
                if(inStr.charAt(i) == inStr.charAt(staticIndex)){
                    count++;
                    if(count == n){
                        out++;
                    }
                }
            }
            staticIndex++;
            count = 0;
        }
        return out;
    }

}
