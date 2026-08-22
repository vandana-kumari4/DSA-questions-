class Solution {
    public String licenseKeyFormatting(String s, int k) {

        StringBuilder result = new StringBuilder();
        int count = 0;

        // Traverse from right to left
        for (int i = s.length() - 1; i >= 0; i--) {

            char ch = s.charAt(i);

            // Ignore existing dashes
            if (ch == '-') {
                continue;
            }

            // Add dash after every k characters
            if (count == k) {
                result.append('-');
                count = 0;
            }

            result.append(Character.toUpperCase(ch));
            count++;
        }

        return result.reverse().toString();
    }
}