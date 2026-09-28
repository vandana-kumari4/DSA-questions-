class Solution {

    static boolean isValid(int[] bloomDay, int m, int k, int day) {

        int bouquets = 0;
        int flowers = 0;

        for (int i = 0; i < bloomDay.length; i++) {

            if (bloomDay[i] <= day) {
                flowers++;

                if (flowers == k) {
                    bouquets++;
                    flowers = 0;
                }
            } 
            else {
                flowers = 0;
            }

            if (bouquets >= m) {
                return true;
            }
        }

        return false;
    }

    public int minDays(int[] bloomDay, int m, int k) {

        long required = (long) m * k;

        if (required > bloomDay.length) {
            return -1;
        }

        int mini = Integer.MAX_VALUE;
        int maxi = Integer.MIN_VALUE;

        for (int day : bloomDay) {
            mini = Math.min(mini, day);
            maxi = Math.max(maxi, day);
        }

        int s = mini;
        int e = maxi;
        int ans = -1;

        while (s <= e) {

            int mid = s + (e - s) / 2;

            if (isValid(bloomDay, m, k, mid)) {
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