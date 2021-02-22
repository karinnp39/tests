import java.util.*;

public class Exp2String {
    static void shift(String arr[], String direction, int d) {
        int n = arr.length;

        if (direction == "left") {
            String temp[] = new String[d];
            for (int i = 0; i < d; i++)
                temp[i] = arr[i];
            for (int i = d; i < n; i++)
                arr[i - d] = arr[i];
            for (int i = 0; i < d; i++)
                arr[i + n - d] = temp[i];
        } else if (direction == "right") {
            String temp[] = new String[n - d];
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
        String arr[] = { "john", "jane", "sarah", "alex" };
        String direction = "left";
        int d = 2;
        shift(arr, direction, d);
    }
}
