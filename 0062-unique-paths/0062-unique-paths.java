class Solution {
    int[][] memo;
    public int uniquePaths(int m, int n) {
        memo = new int[m][n];
        for (int i = 0 ; i < m ; i++){
            Arrays.fill(memo[i],-1);
        }
        return findPaths(m-1,n-1,0,0);
    }

    private int findPaths(int m, int n, int i, int j) {
        if (i>m||j>n)
            return 0;
        if (memo[i][j]!=-1)
            return memo[i][j];
        if (i==m&&j==n)
            return 1;
        return memo[i][j]=findPaths(m,n,i+1,j)+findPaths(m,n,i,j+1);
    }
}