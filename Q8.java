//program to find the smallest subarray with the sum greater than a given value.
//NOW TRYING TO FIND A BETTER TIME COMPLEXITY-O(n)
public class Q8 {
    static int counter = 1;

    public static void main(String args[]) {
        int a[] = { 1, 2, 4 };
        int x = 8;
        int b = 0, i = 0;
        int e = a.length - 1, temp = 0, count = Integer.MAX_VALUE;
        while (e >= i) {

            if (temp <= x) {
                temp = temp + a[i];
                ++i;
            } else if (x < temp) {
                if (count > i - b) {
                    count = i - b; // not adding one cause of line no.15
                }
                temp = temp - a[b];
                ++b;
            }

        }
        System.out.println(count);

    }

}
