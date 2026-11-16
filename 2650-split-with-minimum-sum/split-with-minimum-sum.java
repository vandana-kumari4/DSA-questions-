
class Solution {
    public int splitNum(int num) {
        int[] digits = new int[10];
        int count = 0;

        while (num > 0) {
            digits[count++] = num % 10;
            num /= 10;
        }

        Arrays.sort(digits, 0, count);

        int num1 = 0;
        int num2 = 0;

        for (int i = 0; i < count; i++) {
            if (i % 2 == 0) {
                num1 = num1 * 10 + digits[i];
            } else {
                num2 = num2 * 10 + digits[i];
            }
        }

        return num1 + num2;
    }
}
