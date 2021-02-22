import java.util.*;

public class Exp2Integer {
    static void shift(int arr[], String direction, int d) {
        int n = arr.length;

        if (direction == "left") {
            int temp[] = new int[d];
            for (int i = 0; i < d; i++)
                temp[i] = arr[i];
            for (int i = d; i < n; i++)
                arr[i - d] = arr[i];
            for (int i = 0; i < d; i++)
                arr[i + n - d] = temp[i];
        } else if (direction == "right") {
            int temp[] = new int[n - d];
            for (int i = 0; i < n - d; i++)
                temp[i] = arr[i];
            for (int i = n - d; i < n; i++)
                arr[i - d - 1] = arr[i];
            for (int i = 0; i < n - d; i++)
                arr[i + d] = temp[i];
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 5 };
        String direction = "left";
        int d = 2;
        shift(arr, direction, d);
    }
}
