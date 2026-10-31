
import java.util.*;

class Solution {
    public int[] maxSubsequence(int[] nums, int k) {

        int n = nums.length;

        int[][] arr = new int[n][2];

        // Store number and its original index
        for (int i = 0; i < n; i++) {
            arr[i][0] = nums[i];
            arr[i][1] = i;
        }

        // Sort by value in decreasing order
        Arrays.sort(arr, (a, b) -> b[0] - a[0]);

        // Select k largest elements
        int[] indices = new int[k];

        for (int i = 0; i < k; i++) {
            indices[i] = arr[i][1];
        }

        // Restore original order
        Arrays.sort(indices);

        // Build answer
        int[] result = new int[k];

        for (int i = 0; i < k; i++) {
            result[i] = nums[indices[i]];
        }

        return result;
    }
}
