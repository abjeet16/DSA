class Solution {
    public static int[][] largestLocal(int[][] grid) {
        int m = grid.length-2 , n = grid[0].length-2;
        int[][] res = new int[m][n];
        for (int i = 0 ; i < m ; i++) {
            for (int j = 0; j < n; j++) {
                res[i][j] = getMax(grid,i,j);
            }
        }
        return res;
    }

    private static int getMax(int[][] grid, int x, int y) {
        int max = Integer.MIN_VALUE;
        for (int i = x;i<x+3;i++){
            for (int j=y;j<y+3;j++){
                max = Math.max(grid[i][j],max);
            }
        }
        return max;
    }
}