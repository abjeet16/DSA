class Solution {
    int[][] moves = {{-1,0},{0,1},{1,0},{0,-1}};
    public int longestIncreasingPath(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int res = Integer.MIN_VALUE;
        int[][] memo = new int[m][n];
        for(int[] i : memo)Arrays.fill(i,-1);
        for(int i = 0 ; i < m ; i++){
            for(int j = 0 ; j < n ; j++){
                res = Math.max(res,dfs(mat,i,j,-1,memo));
            }
        }
        return res;
    }
    private int dfs(int[][] mat,int i , int j, int prev,int[][] memo){
        int m = mat.length;
        int n = mat[0].length;
        if(i<0||i==m||j<0||j==n||mat[i][j]<=prev)return 0;
        if(memo[i][j]!=-1)return memo[i][j];
        int res = 1;
        for(int[] move : moves){
            int ni = i+move[0];
            int nj = j+move[1];
            res = Math.max(res,1+dfs(mat,ni,nj,mat[i][j],memo));
        }
        return memo[i][j] = res;
    }
}