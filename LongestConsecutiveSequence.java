import java.util.*;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {

        int arr[] = {100, 4, 200, 1, 3, 2};

        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {
            set.add(num);
        }

        int longest = 0;

        for (int num : set) {

            // Check if num is the start of a sequence
            if (!set.contains(num - 1)) {

                int current = num;
                int count = 1;

                while (set.contains(current + 1)) {
                    current++;
                    count++;
                }

                longest = Math.max(longest, count);
            }
        }

        System.out.println("Longest Consecutive Sequence: " + longest);
    }
}