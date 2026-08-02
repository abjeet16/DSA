class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        if (m*n==original.length) {
            int[][] solution = new int[m][n];
            int index = 0;
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    solution[i][j] = original[index];
                    index++;
                }
            }
            return solution;
        }
        return new int[][]{};
    }
}