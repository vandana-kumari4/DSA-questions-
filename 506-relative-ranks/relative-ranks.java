
import java.util.Arrays;

class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        int[][] arr = new int[n][2];

        // Store score and original index
        for (int i = 0; i < n; i++) {
            arr[i][0] = score[i];
            arr[i][1] = i;
        }

        // Sort in descending order of scores
        Arrays.sort(arr, (a, b) -> Integer.compare(b[0], a[0]));

        String[] answer = new String[n];

        for (int i = 0; i < n; i++) {
            int index = arr[i][1];

            if (i == 0) {
                answer[index] = "Gold Medal";
            } else if (i == 1) {
                answer[index] = "Silver Medal";
            } else if (i == 2) {
                answer[index] = "Bronze Medal";
            } else {
                answer[index] = String.valueOf(i + 1);
            }
        }

        return answer;
    }
}
