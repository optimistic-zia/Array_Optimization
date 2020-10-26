//NOT BEEN ABLE TO DO YET!!!!
//program to find the max of increasing sequence in an array, skipping terms is also allowed.

public class Q7 {
    public static void main(String args[]) {
        int[] arr = { 1, 101, 2, 3, 100 };
        int n = arr.length;
        int b[][] = new int[arr.length][arr.length];
        int temp, sum;
        for (int i = 0; i < n; i++) {
            temp = arr[i];
            sum = 0;
            for (int j = 0; j < n; j++) {
                if (temp < arr[j] && arr[j]) {
                    temp = arr[j];
                    sum = sum + temp;
                }
                b[i][j] = sum;

            }
        }
        System.out.println(sum);
    }

}
