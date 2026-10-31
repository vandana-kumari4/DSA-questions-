
import java.util.*;

class Solution {
    public int maxProductDifference(int[] nums) {

        Arrays.sort(nums);

        int n = nums.length;

        int largest = nums[n - 1] * nums[n - 2];

        int smallest = nums[0] * nums[1];

        return largest - smallest;
    }
}
