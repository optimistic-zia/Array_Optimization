public class Q4 {
    public static void main(String args[]) {
        int a[] = { 3, 5, 4, 2, 6, 5, 6, 6, 5, 4, 8, 3 };
        int n = a.length - 1;
        int x = 3, y = 6, xi = -1, yi = -1;
        int temp = -1, min = Integer.MAX_VALUE;
        for (int i = 0; i <= n; i++) {
            if (a[i] == x)
                xi = i;
            else if (a[i] == y)
                yi = i;
            if (xi != -1 && yi != -1) {
                temp = xi - yi;
                if (temp < 0)
                    temp = (temp * -1);
                if (min > temp)
                    min = temp;

            }

        }
        System.out.println(min);
    }

}
