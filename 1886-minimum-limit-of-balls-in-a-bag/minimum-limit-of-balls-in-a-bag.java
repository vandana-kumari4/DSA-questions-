class Solution {

    static boolean isValid(int[] nums, int maxOperations, int limit) {

        long operations = 0;

        for (int num : nums) {

            operations += (num - 1) / limit;

            if (operations > maxOperations) {
                return false;
            }
        }

        return true;
    }

    public int minimumSize(int[] nums, int maxOperations) {

        int maxi = 0;

        for (int num : nums) {
            maxi = Math.max(maxi, num);
        }

        int s = 1;
        int e = maxi;
        int ans = maxi;

        while (s <= e) {

            int mid = s + (e - s) / 2;

            if (isValid(nums, maxOperations, mid)) {

                ans = mid;
                e = mid - 1;

            } else {

                s = mid + 1;
            }
        }

        return ans;
    }
}