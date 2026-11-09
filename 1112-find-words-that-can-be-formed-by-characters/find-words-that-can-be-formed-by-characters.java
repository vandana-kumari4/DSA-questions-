
class Solution {
    public int countCharacters(String[] words, String chars) {

        int[] freq = new int[26];

        for (char ch : chars.toCharArray()) {
            freq[ch - 'a']++;
        }

        int sum = 0;

        for (String word : words) {

            int[] temp = freq.clone();
            boolean good = true;

            for (char ch : word.toCharArray()) {

                if (temp[ch - 'a'] > 0) {
                    temp[ch - 'a']--;
                }
                else {
                    good = false;
                    break;
                }
            }

            if (good) {
                sum += word.length();
            }
        }

        return sum;
    }
}
