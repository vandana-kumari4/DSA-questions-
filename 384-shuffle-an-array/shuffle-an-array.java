class Solution {

    private int[] original;
    private int[] nums;

    public Solution(int[] nums) {
        this.original = nums.clone();
        this.nums = nums.clone();
    }

    public int[] reset() {
        nums = original.clone();
        return nums;
    }

    public int[] shuffle() {

        Random random = new Random();

        for (int i = nums.length - 1; i > 0; i--) {

            int j = random.nextInt(i + 1);

            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }

        return nums;
    }
}