class Solution {
    public int numSquares(int n) {
        List<Integer> pf = new ArrayList<>();
        getPrimeFac(pf,n);
        int[][] memo = new int[n+1][pf.size()+1];
        for(int[] row : memo)Arrays.fill(row,-1);
        return find(pf,n,pf.size()-1,memo);
    }
    private void getPrimeFac(List<Integer> pf,int n){
        for(int i = 1; i<=n/i ;i++){
            pf.add(i*i);
        }
    }
    private int find(List<Integer> pf,int n,int i,int[][] memo){
        if(i==0){
            return n;
        }
        if(n==0)return 0;
        if(memo[n][i]!=-1)return memo[n][i];
        int res = n;
        for(int j = i ; j >=0; j--){
            if(pf.get(j)<=n)
                res = Math.min(res,1+find(pf,n-pf.get(j),j,memo));
        }
        return memo[n][i] = res;
    }
}