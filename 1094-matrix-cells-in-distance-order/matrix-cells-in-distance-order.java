
import java.util.Arrays;

class Solution {
    public int[][] allCellsDistOrder(int rows, int cols, int rCenter, int cCenter) {
        int[][] cells = new int[rows * cols][2];
        int index = 0;

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                cells[index][0] = r;
                cells[index][1] = c;
                index++;
            }
        }

        Arrays.sort(cells, (a, b) -> {
            int distA = Math.abs(a[0] - rCenter) + Math.abs(a[1] - cCenter);
            int distB = Math.abs(b[0] - rCenter) + Math.abs(b[1] - cCenter);
            return distA - distB;
        });

        return cells;
    }
}
