import java.util.*;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4};
        int n = arr.length;

        int result[] = new int[n];

        // Prefix product
        int prefix = 1;

        for (int i = 0; i < n; i++) {
            result[i] = prefix;
            prefix *= arr[i];
        }

        // Suffix product
        int suffix = 1;

        for (int i = n - 1; i >= 0; i--) {
            result[i] *= suffix;
            suffix *= arr[i];
        }

        System.out.println(Arrays.toString(result));
    }
}