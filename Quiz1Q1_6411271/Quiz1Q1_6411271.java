package Quiz_1;

public class Quiz1Q1_6411271 {

    public static void main(String[] args) {

        int[] array1 = {1,7,7}; // true
        System.out.println(hasNN(7, array1));

        int[] array2 = {1,7,1,7}; // true
        System.out.println(hasNN(7, array2));

        int[] array3 = {1,7,1,17}; // false
        System.out.println(hasNN(7, array3));

        int[] array4 = {12,5,100,5}; // true
        System.out.println(hasNN(5, array4));

        int[] array5 = {5,5,5,7}; // true
        System.out.println(hasNN(5, array5));

        int[] array6 = {13,5,120,11,5}; // false
        System.out.println(hasNN(5, array6));

        int[] array7 = {1,2,3,3,2,3}; // true
        System.out.println(hasNN(3, array7));

        int[] array8 = {1,2,3,3,2,3}; // false
        System.out.println(hasNN(2, array8));

        int[] array9 = {1,3,5,7,8,8,7}; // false
        System.out.println(hasNN(7, array9));

        int[] array10 = {1,3,5,7,8,8,7}; // true
        System.out.println(hasNN(8, array10));

        int[] array11 = {1,7,1}; // true
        System.out.println(hasNN(1,array11));

        int[] array12 = {1,0,0}; // false
        System.out.println(hasNN(1,array12));

    }

    public static boolean hasNN(int N,int[] arr) {

        if (arr.length<=3) {
            for (int i = 0; i < arr.length; i++) {
                if ((arr[i]==N && arr[i+1]==N) || (arr[i]==N && arr[i+2]==N)) {
                    return true;
                }
            }
        } else {
            for (int i = 0; i < arr.length-2; i++) {
                if ((arr[i]==N && arr[i+1]==N) || (arr[i]==N && arr[i+2]==N)) {
                    return true;
                }
            }
        }

        return false;
    }

}
