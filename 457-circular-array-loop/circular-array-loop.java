class Solution {
    public boolean circularArrayLoop(int[] nums) {
        int n = nums.length;

        for (int i = 0; i < n; i++) {

            // Start only if this direction has not been removed
            if (nums[i] == 0) {
                continue;
            }

            boolean forward = nums[i] > 0;
            int slow = i;
            int fast = i;

            while (true) {
                slow = nextIndex(nums, slow, forward);

                if (slow == -1) {
                    break;
                }

                fast = nextIndex(nums, fast, forward);

                if (fast == -1) {
                    break;
                }

                fast = nextIndex(nums, fast, forward);

                if (fast == -1) {
                    break;
                }

                if (slow == fast) {
                    return true;
                }
            }

            // Mark this path as already checked
            int curr = i;

            while (true) {
                int next = nextIndex(nums, curr, forward);

                if (next == -1) {
                    break;
                }

                nums[curr] = 0;
                curr = next;
            }

            nums[i] = 0;
        }

        return false;
    }

    private int nextIndex(int[] nums, int index, boolean forward) {
        // Direction must remain the same
        if ((nums[index] > 0) != forward) {
            return -1;
        }

        int n = nums.length;

        // Calculate next circular index
        int next = (index + nums[index]) % n;

        if (next < 0) {
            next += n;
        }

        // Cycle of length 1 is not allowed
        if (next == index) {
            return -1;
        }

        return next;
    }
}