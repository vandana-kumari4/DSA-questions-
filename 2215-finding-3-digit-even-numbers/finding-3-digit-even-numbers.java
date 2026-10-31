import java.util.*;

class Solution {
    public int[] findEvenNumbers(int[] digits) {

        TreeSet<Integer> set = new TreeSet<>();

        for (int i = 0; i < digits.length; i++) {

            // First digit 0 nahi ho sakta
            if (digits[i] == 0) {
                continue;
            }

            for (int j = 0; j < digits.length; j++) {

                // Same index dobara use nahi karna
                if (j == i) {
                    continue;
                }

                for (int k = 0; k < digits.length; k++) {

                    // Same index dobara use nahi karna
                    if (k == i || k == j) {
                        continue;
                    }

                    // Last digit even hona chahiye
                    if (digits[k] % 2 != 0) {
                        continue;
                    }

                    int num = digits[i] * 100
                            + digits[j] * 10
                            + digits[k];

                    set.add(num);
                }
            }
        }

        int[] ans = new int[set.size()];

        int index = 0;

        for (int num : set) {
            ans[index++] = num;
        }

        return ans;
    }
}
