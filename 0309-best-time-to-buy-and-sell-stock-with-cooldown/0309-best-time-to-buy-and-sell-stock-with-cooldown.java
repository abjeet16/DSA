class Solution {
    public int maxProfit(int[] p) {
        int n = p.length;
        int[][][] memo = new int[n][2][2];
        for(int[][] j : memo)
            for(int[] i : j)
                Arrays.fill(i,-1);
        return get(p,0,0,1,memo);
    }
    private int get(int[] p,int i,int cd,int isbuy,int[][][] memo){
        if(i==p.length)return 0;
        if(memo[i][isbuy][cd]!=-1)return memo[i][isbuy][cd];

        int res = 0;
        if(isbuy==1){
            res = get(p,i+1,0,isbuy,memo);
            if(cd!=1)
                res = Math.max(res,-p[i]+get(p,i+1,cd,0,memo));
        }else{
            res = get(p,i+1,cd,isbuy,memo);
            res = Math.max(res,p[i]+get(p,i+1,1,1,memo));
        }
        return memo[i][isbuy][cd] = res;
    }
}