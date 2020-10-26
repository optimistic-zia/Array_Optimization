
//program to find the average of the max subarray's starting position
public class Q9 {
    public static void main(String args[]) {
        int[] arr = { 1, 12, -5, -6, 50, 3 };
        int n = arr.length;
        int k = 4;
        int index = -1;
        int temp = 0, sum = Integer.MIN_VALUE, counter = 0;
        for (int i = 0; i < n; i++) {
            temp = arr[i] + temp;
            if (i + 1 >= k) {
                if (sum < temp) {
                    sum = temp;
                    index = i - k + 1;
                }
                temp = temp - arr[counter];
                ++counter;
            }
        }
        System.out.println(index);
    }

}
