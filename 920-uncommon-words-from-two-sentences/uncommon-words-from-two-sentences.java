
import java.util.*;

class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {

        Map<String, Integer> map = new HashMap<>();

        // Split both sentences into words
        String[] words1 = s1.split(" ");
        String[] words2 = s2.split(" ");

        // Count words from first sentence
        for (String word : words1) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        // Count words from second sentence
        for (String word : words2) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        // Find words appearing exactly once
        List<String> list = new ArrayList<>();

        for (String word : map.keySet()) {
            if (map.get(word) == 1) {
                list.add(word);
            }
        }

        return list.toArray(new String[0]);
    }
}
