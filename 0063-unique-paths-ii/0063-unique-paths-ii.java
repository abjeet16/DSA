class Solution {
    static int[][] memo;
    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        memo = new int[m][n];
        for (int i = 0 ; i < m ; i++){
            Arrays.fill(memo[i],-1);
        }
        return findPaths(m-1,n-1,0,0,obstacleGrid);
    }

    private static int findPaths(int m, int n, int i, int j,int[][] obstacleGrid) {
        if (i>m||j>n||obstacleGrid[i][j]==1)
            return 0;
        if (memo[i][j]!=-1)
            return memo[i][j];
        if (i==m&&j==n)
            return 1;
        return memo[i][j]=findPaths(m,n,i+1,j,obstacleGrid)+findPaths(m,n,i,j+1,obstacleGrid);
    }
}