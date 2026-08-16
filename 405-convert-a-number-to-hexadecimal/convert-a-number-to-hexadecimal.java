class Solution {
    public String toHex(int num) {

        if (num == 0) {
            return "0";
        }

        char[] hex = "0123456789abcdef".toCharArray();

        StringBuilder result = new StringBuilder();

        while (num != 0) {

            // Get last 4 bits
            int digit = num & 15;

            // Convert to hexadecimal character
            result.append(hex[digit]);

            // Unsigned right shift by 4 bits
            num >>>= 4;
        }

        return result.reverse().toString();
    }
}