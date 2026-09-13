import java.util.*;

class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        Map<Integer, Integer> freq = new HashMap<>();

        // Count frequency of elements in arr1
        for (int num : arr1) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        int[] result = new int[arr1.length];
        int index = 0;

        // Add elements according to arr2 order
        for (int num : arr2) {
            while (freq.get(num) > 0) {
                result[index++] = num;
                freq.put(num, freq.get(num) - 1);
            }
            freq.remove(num);
        }

        // Add remaining elements in ascending order
        List<Integer> remaining = new ArrayList<>(freq.keySet());
        Collections.sort(remaining);

        for (int num : remaining) {
            while (freq.get(num) > 0) {
                result[index++] = num;
                freq.put(num, freq.get(num) - 1);
            }
        }

        return result;
    }
}