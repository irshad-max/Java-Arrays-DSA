import java.util.*;

class ThreeSum {
    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5};
        int target = 12;

        Arrays.sort(arr);

        for (int i = 0; i < arr.length - 2; i++) {

            int left = i + 1;
            int right = arr.length - 1;

            while (left < right) {

                int sum = arr[i] + arr[left] + arr[right];

                if (sum == target) {
                    System.out.println(
                        arr[i] + " + " + arr[left] + " + " + arr[right]
                    +"="+target);
                    return;
                }
                else if (sum < target) {
                    left++;
                }
                else {
                    right--;
                }
            }
        }
    }
}
