
import java.util.*;

class Solution {
    public int uniqueMorseRepresentations(String[] words) {

        String[] morse = {
            ".-", "-...", "-.-.", "-..", ".", "..-.",
            "--.", "....", "..", ".---", "-.-", ".-..",
            "--", "-.", "---", ".--.", "--.-", ".-.",
            "...", "-", "..-", "...-", ".--", "-..-",
            "-.--", "--.."
        };

        HashSet<String> set = new HashSet<>();

        for (String word : words) {

            String code = "";

            for (int i = 0; i < word.length(); i++) {

                char ch = word.charAt(i);

                code += morse[ch - 'a'];
            }

            set.add(code);
        }

        return set.size();
    }
}
