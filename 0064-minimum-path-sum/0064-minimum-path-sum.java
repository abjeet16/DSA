class Solution {
    int MAX = 40001;
    int[][] memo;
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        memo = new int[m][n];
        for(int i = 0 ; i < m ; i++)
            Arrays.fill(memo[i],-1);
        return min(0,0,m-1,n-1,grid);
    }
    int min(int i , int j , int m , int n , int[][] grid){
        if(i>m||j>n)
            return MAX;
        if(memo[i][j]!=-1)
            return memo[i][j];
        if(i==m&&j==n){
            memo[i][j] = grid[i][j];
            return memo[i][j];
        }
        int right = min(i,j+1,m,n,grid);
        int down = min(i+1,j,m,n,grid);
        return memo[i][j] = grid[i][j]+Math.min(right,down);
    }
}