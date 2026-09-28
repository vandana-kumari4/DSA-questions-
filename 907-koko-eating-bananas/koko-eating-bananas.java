class Solution {

    static boolean isValidAns(int[] piles, int h, int speed) {
        long hours = 0;

        for (int pile : piles) {
            hours += (pile + speed - 1) / speed;

            if (hours > h) {
                return false;
            }
        }

        return true;
    }

    public int minEatingSpeed(int[] piles, int h) {

        int maxi = 0;

        for (int pile : piles) {
            maxi = Math.max(maxi, pile);
        }

        int s = 1;
        int e = maxi;
        int ans = maxi;

        while (s <= e) {

            int mid = s + (e - s) / 2;

            if (isValidAns(piles, h, mid)) {
                ans = mid;
                e = mid - 1;      
            } else {
                s = mid + 1;       
            }
        }

        return ans;
    }
}