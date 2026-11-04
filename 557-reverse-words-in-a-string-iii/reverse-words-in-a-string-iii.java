
class Solution {
    public String reverseWords(String s) {

        String[] words = s.split(" ");
        StringBuilder ans = new StringBuilder();

        for (String word : words) {

            StringBuilder sb = new StringBuilder(word);
            ans.append(sb.reverse()).append(" ");
        }

        return ans.toString().trim();
    }
}
