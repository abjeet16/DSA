class Solution {
    int[] move = {-1,0,1};
    public int cherryPickup(int[][] g) {
        int m = g.length,n = g[0].length;
        int[][][] memo = new int[m][n][n];
        for(int i[][] : memo){
            for(int j[] : i){
                Arrays.fill(j,-1);
            }
        }
        return find(g,m,n,0,0,n-1,memo);
    }
    private int find(int[][] g,int m , int n ,int i , int j1 ,int j2,int[][][] memo){
        if(i>=m||i<0||j1>=n||j2>=n||j1<0||j2<0)return 0;
        if(memo[i][j1][j2]!=-1)return memo[i][j1][j2];
        
        int res = 0;
        for(int m1 : move){
            for(int m2 : move){
                res = Math.max(res,j1==j2?g[i][j1]:g[i][j1]+g[i][j2]+find(g,m,n,i+1,j1+m1,j2+m2,memo));
            }
        }
        return memo[i][j1][j2] =  res;
    }
}