
import java.util.Arrays;

class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {

        // Step 1: Sort the array
        Arrays.sort(nums);

        // Step 2: Calculate prefix sum
        int n = nums.length;
        int[] prefix = new int[n];

        prefix[0] = nums[0];

        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }

        // Step 3: Answer each query using binary search
        int[] ans = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {

            int left = 0;
            int right = n - 1;
            int count = 0;

            while (left <= right) {

                int mid = left + (right - left) / 2;

                if (prefix[mid] <= queries[i]) {
                    count = mid + 1;
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }

            ans[i] = count;
        }

        return ans;
    }
}
