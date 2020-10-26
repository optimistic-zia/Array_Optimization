
//time complexity o(n^2)
import java.util.Arrays;
import java.util.Collections;

public class Q1 {
    public static void main(String args[]) {
        int[] a = { -2, -3, 4, -1, -2, 1, 5, -3 };
        Integer b[] = new Integer[a.length];
        int submax = 0, sum = 0;
        for (int i = 0; i < a.length; i++) {
            submax = Integer.MIN_VALUE;
            sum = 0;
            for (int j = i; j < a.length; j++) {
                sum = sum + a[j];
                if (submax < sum) {
                    submax = sum;
                    b[i] = submax;
                }
            }
        }
        Arrays.sort(b, Collections.reverseOrder());
        System.out.println(b[0]);
        // for (int p = 0; p < b.length; p++) {
        // System.out.println(b[p]);
        // }
    }
}