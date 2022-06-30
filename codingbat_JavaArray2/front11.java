package codingbat_JavaArray2;

public class front11 {

    public static void main(String[] args) {
        int[] x = new int[] {1, 2, 3};
        int[] y = new int[] {7, 9, 8};
        System.out.println(front11(x,y));
        for (int each:front11(x,y)) {
            System.out.print(each + " ");
        }
    }

    public static int[] front11(int[] a, int[] b) {

        if (a.length == 0 && b.length==0) {
            return a;
        }

        if (a.length==0) {
            int[] out = new int[] {b[0]};
            return out;
        }

        if (b.length==0) {
            int[] out = new int[] {a[0]};
            return out;
        }

        int[] out = new int[] {a[0], b[0]};
        return out;
    }

}
