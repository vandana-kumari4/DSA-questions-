class Solution {
    public int distinctAverages(int[] nums) {
        Arrays.sort(nums);
        Set<Integer> sums = new HashSet<>();

        int i = 0, j = nums.length - 1;
        while (i < j) {
            sums.add(nums[i] + nums[j]);
            i++;
            j--;
        }

        return sums.size();
    }
}