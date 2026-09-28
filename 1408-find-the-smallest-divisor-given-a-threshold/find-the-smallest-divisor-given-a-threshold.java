class Solution {

    static boolean isValid(int[] nums, int threshold, int divisor) {

        long sum = 0;

        for (int num : nums) {

            sum += (num + divisor - 1) / divisor;

            if (sum > threshold) {
                return false;
            }
        }

        return true;
    }

    public int smallestDivisor(int[] nums, int threshold) {

        int maxi = 0;

        for (int num : nums) {
            maxi = Math.max(maxi, num);
        }

        int s = 1;
        int e = maxi;
        int ans = maxi;

        while (s <= e) {

            int mid = s + (e - s) / 2;

            if (isValid(nums, threshold, mid)) {
                ans = mid;
                e = mid - 1;
            } 
            else {
                s = mid + 1;
            }
        }

        return ans;
    }
}