import java.util.Arrays;

public class Exp3 {
    public static void secondMax(int arr[], int size) {
        int i;
        if (size == 0) {
            System.out.printf("Error!");
            return;
        } else if (size < 2) {
            System.out.printf("The second largest element is %d\n", arr[0]);
            return;
        }
        Arrays.sort(arr);
        for (i = size - 2; i >= 0; i--) {
            if (arr[i] != arr[size - 1]) {
                System.out.printf("The second largest element is %d\n", arr[i]);
                return;
            }
        }
    }

    public static void main(String[] args) {
        // int a[] = { 2, 3, 4, 5 };
        // int a[] = { 9, 2, 21, 21 };
        // int a[] = { 4, 4, 4, 4 };
        int a[] = { 4123 };
        // int a[] = {};
        secondMax(a, a.length);
    }
}
