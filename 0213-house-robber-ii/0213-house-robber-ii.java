class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n==1)return nums[0];
        int[] memo = new int[n];
        Arrays.fill(memo,-1);
        int take0 = helper(nums,n-1,0,memo);
        Arrays.fill(memo,-1);
        int take1 = helper(nums,n,1,memo);
        return Math.max(take0,take1);
    }
    int helper(int[] nums,int n,int i,int[] memo){
        if(i>=n)return 0;
        if(memo[i]!=-1)return memo[i];
        return memo[i]=Math.max(nums[i]+helper(nums,n,i+2,memo),helper(nums,n,i+1,memo));
    }
}