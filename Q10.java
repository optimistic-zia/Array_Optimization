import java.util.Arrays;

public class Q10 {
    static int counter = 0;

    public static void main(String args[]) {
        int a[] = { 16, 16, 16 };
        int b[] = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            b[i] = 0;
        }
        int numSteps = count(a, b);
        System.out.println(numSteps);
    }

    static int count(int[] a, int[] b) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                a[i] -= 1;
                ++counter;
            }
        }
        if (Arrays.equals(a, b))
            return counter;
        for (int i = 0; i < a.length; i++) {
            a[i] = a[i] / 2;
        }
        ++counter;
        return count(a, b);

    }
}