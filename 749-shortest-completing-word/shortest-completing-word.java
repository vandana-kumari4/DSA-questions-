
class Solution {
    public String shortestCompletingWord(String licensePlate, String[] words) {

        int[] required = new int[26];

        // Count letters in licensePlate
        for (char ch : licensePlate.toCharArray()) {

            if (Character.isLetter(ch)) {
                ch = Character.toLowerCase(ch);
                required[ch - 'a']++;
            }
        }

        String ans = "";

        // Check every word
        for (String word : words) {

            int[] freq = new int[26];

            for (char ch : word.toCharArray()) {
                freq[ch - 'a']++;
            }

            boolean valid = true;

            for (int i = 0; i < 26; i++) {

                if (freq[i] < required[i]) {
                    valid = false;
                    break;
                }
            }

            // Update shortest completing word
            if (valid && (ans.equals("") || word.length() < ans.length())) {
                ans = word;
            }
        }

        return ans;
    }
}
