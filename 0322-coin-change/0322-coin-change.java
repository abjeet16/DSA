class Solution {
    int[][] memo;
    public int coinChange(int[] coins, int amount) {
        Arrays.sort(coins);
        memo = new int[coins.length][amount+1];
        for(int[] r : memo){
            Arrays.fill(r,-1);
        }
        int ans = getAns(coins,amount,coins.length-1);
        if(ans>10000)return -1;
        return ans;
    }
    private int getAns(int[] coins , int amount , int i){
        if(i==-1){
            if(amount==0){
                return 0;
            }
            return 10001;
        }
        if(memo[i][amount]!=-1)return memo[i][amount];
        int take = 10001;
        if(amount>=coins[i]){
            take = 1+getAns(coins,amount-coins[i],i);
        }
        int dont = getAns(coins,amount,i-1);
        return memo[i][amount]=Math.min(take,dont);
    }
}