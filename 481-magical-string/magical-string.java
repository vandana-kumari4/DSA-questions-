class Solution {
    public int magicalString(int n) {
        if (n == 0) return 0;
        if (n <= 3) return 1;

        int[] s = new int[n + 1];

        s[0] = 1;
        s[1] = 2;
        s[2] = 2;

        int i = 2;
        int num = 1;
        int countOnes = 1;
        int length = 3;

        while (length < n) {

            int times = s[i];

            for (int j = 0; j < times && length < n; j++) {
                s[length] = num;

                if (num == 1) {
                    countOnes++;
                }

                length++;
            }

            // Alternate 1 and 2
            num = 3 - num;

            i++;
        }

        return countOnes;
    }
}