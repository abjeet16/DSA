class Solution {
    public int maxProfit(int k, int[] p) {
        int n = p.length;
        int[][][] memo = new int[n][2][k+1];
        for(int[][] i : memo)
            for(int[] j : i)
                Arrays.fill(j,-1);
        return get(p,k,0,1,memo);
    }
    private int get(int[] p ,int k ,int i,int isbuy,int[][][] memo){
        if(k==0||i==p.length)return 0;
        if(memo[i][isbuy][k]!=-1)return memo[i][isbuy][k];
        int res = 0;
        if(isbuy==1){
            int skip = get(p,k,i+1,isbuy,memo);
            int buy = -p[i] + get(p,k,i+1,0,memo);
            res = Math.max(skip,buy);
        }else{
            int skip = get(p,k,i+1,isbuy,memo);
            int sell = p[i] + get(p,k-1,i+1,1,memo);
            res = Math.max(skip,sell);
        }
        return memo[i][isbuy][k]=res;
    }
}