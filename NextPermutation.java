public class NextPermutation {
    public static void main(String[] args) {
        int arr[] = {1, 2, 5, 4, 3};
        int n = arr.length;
        int pivot = -1;
        //find pivot
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] < arr[i + 1]) {
                pivot = i;
                break;
            }
        }
        //swap the values pivot and just bigger thann pivot
        if (pivot != -1) {
            for (int i = n - 1; i > pivot; i--) {
                if (arr[i] > arr[pivot]) {
                    int temp = arr[i];
                    arr[i] = arr[pivot];
                    arr[pivot] = temp;
                    break;
                }
            }
        }
        //swap the pivot+1 to n-1 to make smalles combination
        int m = pivot + 1;
        int p = n - 1;

        while (m < p) {
            int temp = arr[m];
            arr[m] = arr[p];
            arr[p] = temp;
            m++;
            p--;
        }

        System.out.println(java.util.Arrays.toString(arr));
    }
}
