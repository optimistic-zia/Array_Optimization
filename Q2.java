import java.lang.reflect.Array;
import java.util.Arrays;

public class Q2 {
    public static void main(String args[]) {
        // int a[] = { 2, 30, 15, 10, 8, 25, 80 };
        int a[] = { 10, 22, 5, 75, 65, 80 };
        int b[] = new int[a.length - 1];
        int x = 0;

        for (int i = 1; i < a.length; i++) {
            if (i < a.length - 2) {
                if (findsubmax(a, 0, i) + findsubmax(a, i + 1, a.length - 1) > findsubmax(a, 0, i)) {
                    b[x] = findsubmax(a, 0, i) + findsubmax(a, i + 1, a.length - 1);
                } else {
                    b[x] = findsubmax(a, 0, i);
                }

            } else {
                b[x] = findsubmax(a, 0, i);
            }
            x++;
        }
        System.out.println(Arrays.toString(b));
        Arrays.sort(b);
        if (b[a.length - 2] > 0)
            System.out.println(b[a.length - 2]);
        else
            System.out.println("0");

    }

    static int findsubmax(int a[], int p, int r) { // to find the maximum postive difference in a subarray
        int d;
        int temp = Integer.MIN_VALUE;
        for (int i = p; i < r; i++) {
            for (int j = i + 1; j <= r; j++) {
                d = a[j] - a[i];
                if (temp < d)
                    temp = d;
            }
        }
        return temp;
    }

}
