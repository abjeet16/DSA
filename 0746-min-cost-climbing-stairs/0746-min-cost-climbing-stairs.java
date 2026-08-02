class Solution {
    int memo[];
    public int minCostClimbingStairs(int[] cost) {
        memo = new int[cost.length];
        Arrays.fill(memo,-1);
        return Math.min(min(cost,0),min(cost,1));
    }
    int min(int[] cost,int i){
        if(i>=cost.length)
            return 0;
        if(memo[i]!=-1)
            return memo[i];
        if(i==cost.length-1)
            return cost[i];
        return memo[i] = cost[i]+Math.min(min(cost,i+1),min(cost,i+2));
    }
}