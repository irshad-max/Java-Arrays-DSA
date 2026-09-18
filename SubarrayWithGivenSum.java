public class SubarrayWithGivenSum {
    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 7, 5};
        int target = 12;

        int left = 0;
        int sum = 0;

        for (int right = 0; right < arr.length; right++) {

            sum += arr[right];

            while (sum > target) {
                sum -= arr[left];
                left++;
            }

            if (sum == target) {
                System.out.println("Subarray found from index "
                        + left + " to " + right);
                return;
            }
        }

        System.out.println("No subarray found");
    }
}