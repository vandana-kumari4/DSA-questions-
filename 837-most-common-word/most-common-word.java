import java.util.*;

class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {

        Set<String> set = new HashSet<>();

        for (String word : banned) {
            set.add(word);
        }

        paragraph = paragraph.toLowerCase();
        String[] words = paragraph.split("[!?',;. ]+");

        Map<String, Integer> map = new HashMap<>();

        String ans = "";
        int max = 0;

        for (String word : words) {

            if (!set.contains(word)) {

                map.put(word, map.getOrDefault(word, 0) + 1);

                if (map.get(word) > max) {
                    max = map.get(word);
                    ans = word;
                }
            }
        }

        return ans;
    }
}