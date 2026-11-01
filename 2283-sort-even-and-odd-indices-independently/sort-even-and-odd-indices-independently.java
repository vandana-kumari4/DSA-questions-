import java.util.*;

class Solution {
    public int[] sortEvenOdd(int[] nums) {
        int n = nums.length;

        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();

        // Separate even and odd indices
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                even.add(nums[i]);
            } else {
                odd.add(nums[i]);
            }
        }

        // Sort even indices in ascending order
        Collections.sort(even);

        // Sort odd indices in descending order
        Collections.sort(odd, Collections.reverseOrder());

        // Put values back into original array
        int e = 0, o = 0;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                nums[i] = even.get(e++);
            } else {
                nums[i] = odd.get(o++);
            }
        }

        return nums;
    }
}