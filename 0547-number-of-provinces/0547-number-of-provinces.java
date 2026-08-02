class Solution {
    public int findCircleNum(int[][] ic) {
        int res = 0;
        int n = ic.length;
        boolean[] seen = new boolean[n];
        for(int i = 0 ; i < n ; i++){
            if(!seen[i]){
                res++;
                dfs(i,ic,seen);
            }
        }
        return res;
    }
    private void dfs(int node , int[][] ic , boolean[] seen){
        seen[node]=true;
        for(int i = 0 ; i < ic.length ;i++){
            if(ic[node][i]==1&&!seen[i]){
                dfs(i,ic,seen);
            }
        }
    }
}