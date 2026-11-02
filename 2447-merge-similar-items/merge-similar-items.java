class Solution {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        int[] weight = new int[1001];

        for (int[] item : items1) {
            weight[item[0]] += item[1];
        }
        for (int[] item : items2) {
            weight[item[0]] += item[1];
        }

        List<List<Integer>> result = new ArrayList<>();
        for (int v = 1; v <= 1000; v++) {
            if (weight[v] > 0) {
                result.add(Arrays.asList(v, weight[v]));
            }
        }

        return result;
    }
}