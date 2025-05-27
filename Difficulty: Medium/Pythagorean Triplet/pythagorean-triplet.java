import java.util.*;

class Solution {
    boolean pythagoreanTriplet(int[] arr) {
        Set<Integer> set = new HashSet<>();
        int n = arr.length;
        int[] squared = new int[n];

        // Step 1: Square all elements and store them
        for (int i = 0; i < n; i++) {
            squared[i] = arr[i] * arr[i];
            set.add(arr[i]);
        }

        // Step 2: Try all pairs and check if their sum exists as a square of another element
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int sum = squared[i] + squared[j];
                int root = (int)Math.sqrt(sum);

                // Check if sum is a perfect square AND its square root exists in the original array
                if (root * root == sum && set.contains(root)) {
                    // Also make sure that c is not the same as a or b if duplicates are not allowed
                    if ((root != arr[i] && root != arr[j]) || countInArray(arr, root) >= 1) {
                        return true;
                    }
                }
            }
        }

        return false;
    }

    // Utility to count occurrence of a number in array
    private int countInArray(int[] arr, int val) {
        int count = 0;
        for (int num : arr) {
            if (num == val) count++;
        }
        return count;
    }
}
