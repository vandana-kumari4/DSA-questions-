class Solution {
    public String sortString(String s) {

        int[] freq = new int[26];
        StringBuilder result = new StringBuilder();

        // Count characters
        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }

        // Repeat until all characters are used
        while (result.length() < s.length()) {

            // Increasing: a -> z
            for (int i = 0; i < 26; i++) {
                if (freq[i] > 0) {
                    result.append((char)(i + 'a'));
                    freq[i]--;
                }
            }

            // Decreasing: z -> a
            for (int i = 25; i >= 0; i--) {
                if (freq[i] > 0) {
                    result.append((char)(i + 'a'));
                    freq[i]--;
                }
            }
        }

        return result.toString();
    }
}