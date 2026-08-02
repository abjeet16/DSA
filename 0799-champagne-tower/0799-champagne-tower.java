class Solution {
    double[][] memo = new double[101][101];

    public double champagneTower(int poured, int query_row, int query_glass) {
        for (double[] row : memo) {
            Arrays.fill(row, -1);
        }
        return Math.min(1.0, solve(poured, query_row, query_glass));
    }

    private double solve(int poured, int i, int j) {
        if (i < 0 || j < 0 || j > i) return 0.0;

        if (i == 0 && j == 0) return poured;

        if (memo[i][j] != -1) return memo[i][j];

        double leftParent = solve(poured, i - 1, j - 1);
        double rightParent = solve(poured, i - 1, j);

        double fromLeft = Math.max(0, leftParent - 1) / 2.0;
        double fromRight = Math.max(0, rightParent - 1) / 2.0;

        memo[i][j] = fromLeft + fromRight;
        return memo[i][j];
    }
}