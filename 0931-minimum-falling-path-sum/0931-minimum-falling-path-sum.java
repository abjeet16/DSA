class Solution {
    int[][] memo;
    public int minFallingPathSum(int[][] matrix) {
        int min = Integer.MAX_VALUE;
        int n = matrix.length;
        memo = new int[n][n];
        for (int[] row : memo) {
            Arrays.fill(row, Integer.MAX_VALUE);
        }
        for (int j = 0 ; j < n ; j++){
            min = Math.min(min,getMin(matrix,0,j));
        }
        return min;
    }

    private int getMin(int[][] matrix, int i, int j) {
        int n = matrix.length;
        if (i < 0 || j < 0 || i >= n || j >= n){
            return Integer.MAX_VALUE;
        }
        if (memo[i][j]!=Integer.MAX_VALUE)
            return memo[i][j];
        if (i == n - 1) {
            return memo[i][j] = matrix[i][j];
        }
        int currMin = Math.min(getMin(matrix,i+1,j),
                Math.min(getMin(matrix,i+1,j-1),
                        getMin(matrix,i+1,j+1)));
        return memo[i][j]=matrix[i][j]+currMin;
    }
}