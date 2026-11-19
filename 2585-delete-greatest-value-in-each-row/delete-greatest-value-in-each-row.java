
class Solution {
    public int deleteGreatestValue(int[][] grid) {

        int m = grid.length;
        int n = grid[0].length;

        // Sort every row
        for (int i = 0; i < m; i++) {
            Arrays.sort(grid[i]);
        }

        int ans = 0;

        // Traverse columns from right to left
        for (int j = n - 1; j >= 0; j--) {

            int max = 0;

            // Find maximum element in current column
            for (int i = 0; i < m; i++) {
                max = Math.max(max, grid[i][j]);
            }

            ans += max;
        }

        return ans;
    }
}
