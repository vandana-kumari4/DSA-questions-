class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> result = new ArrayList<>();
        result.add(words[0]);
        String prevKey = sortChars(words[0]);

        for (int i = 1; i < words.length; i++) {
            String key = sortChars(words[i]);
            if (!key.equals(prevKey)) {
                result.add(words[i]);
                prevKey = key;
            }
        }

        return result;
    }

    private String sortChars(String s) {
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }
}