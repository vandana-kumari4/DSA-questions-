class Solution {
    public int findMaxK(int[] nums) {
        boolean[] seen = new boolean[2001];
        int best = -1;

        for (int num : nums) {
            if (seen[-num + 1000]) {
                best = Math.max(best, Math.abs(num));
            }
            seen[num + 1000] = true;
        }

        return best;
    }
}