class Solution {
    public long maxAlternatingSum(int[] nums) {
        long memo[][] = new long[nums.length][2];
        for(long[] i : memo)Arrays.fill(i,-1);
        return ans(nums,0,1,memo);
    }
    private long ans(int[] nums, int i , int iseven,long memo[][]){
        if(i==nums.length)return 0;
        if(memo[i][iseven]!=-1)return memo[i][iseven];
        long res = ans(nums,i+1,iseven,memo);
        if(iseven==1){
            res = Math.max(res,nums[i]+ans(nums,i+1,0,memo));
        }else{
            res = Math.max(res,-nums[i]+ans(nums,i+1,1,memo));
        }
        return memo[i][iseven]=res;
    }
}